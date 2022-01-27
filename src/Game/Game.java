package Game;

import cmd.Prompt;
import tree.Node;
import tree.Tree;

import java.util.Objects;
import java.util.Optional;

public class Game {

    //O código original me pareceu facilmente representável por uma árvore binária,
    // portanto, optei por essa estrutura de dados
    private Tree tree;

    //Essa classe encapsula todas as regras de negócio que determinam o próximo passo do programa,
    //mas não é de sua responsabilidade executar nada além dessa verificação
    //esse trabalho está, no geral, dentro da classe Game
    private Next parser;

    public Game() {
        this.tree = new Tree();
        this.parser = new Next();
    }

    public void start() {
        System.out.println("Pense em um animal...");
        String response = Prompt.getResponse(this.tree.getRoot().getValue());
        Node current = this.tree.getRoot();
        //Loop do programa que avalia a resposta e decide a próxima ação
        while (true) {
            //q simplesmente sai do programa
            if (response.equals("q")) break;
            //O parser determina qual será o próximo nó a ser executado
            Node node = this.parser.evaluate(response, current);
            if (this.parser.checkGameOverSuccess(response, node)) {
                //Usuário respondeu com "s" num nó folha, não há mais o que fazer
                //além de repetir o laço do jogo
                System.out.println("Acertei!");
                this.start();
                break;
            } else if (this.parser.checkFollowing(node)) {
                //Existe um próximo nó, e o usuário deve escolher um caminho
                current = node;
                response = Prompt.getResponse(current.getValue());
            } else {
                //Usuário respondeu com "n" num nó folha, o programa não sabe qual é
                //o animal, e irá adicioná-lo à árvore
                Update.updateNode(current, Prompt.newAnimal(current.getValue()));
                //O jogo aprendeu um novo animal, colocou-o na árvore, juntamente com
                //Qual pista leva até ele. O laço se repete.
                this.start();
                break;
            }
        }
    }
}
