package Game;

import tree.Node;

import java.util.ArrayList;

public class Update {

    //Método principal que dá graça ao jogo. Recebe o último nó, além de um array
    //contendo uma pista e um animal, que serão adicionados à árvore.
    public static void updateNode(Node node, ArrayList<String> updateWith) {
        //O método getPrevious é uma maneira um tanto simplificada de buscar pelo pai
        //do nó atual, mas que serve para o escopo desse teste.
        Node parent = node.getPrevious();
        Node clue = new Node(updateWith.get(0));
        Node animal = new Node(updateWith.get(1));
        //O novo animal sempre será o nó direito da pista
        clue.setRight(animal);
        //O setPrevious servirá para que, no futuro, possa-se localizar o pai
        //deste nó para lhe atualizar rápidamente, sem percorrer a árvore
        animal.setPrevious(clue);
        node.setPrevious(clue);
        //O nó atual sempre será o nó esquerdo da pista
        clue.setLeft(node);
        clue.setPrevious(parent);
        //Método que inverte a pista com o nó atual com relação ao nó pai
        invertClueAndLeaf(parent, node, clue);
    }

    private static void invertClueAndLeaf(Node parent, Node leaf, Node clue) {
        boolean res = isNodeParentsLeftChildren(parent, leaf);
        //Se o nó atual era o filho esquerdo do nó pai, então a pista agora é o nó esquerdo
        //Senão, ela era o nó direito, e então a pista será o novo nó direito
        if (res) {
            parent.setLeft(clue);
        } else {
            parent.setRight(clue);
        }
    }

    //Verifica a posição do nó atual na árvore
    private static boolean isNodeParentsLeftChildren(Node parent, Node node) {
        String parentLeftValue = parent.getLeft().getValue();
        String nodeValue = node.getValue();
        return parentLeftValue.equals(nodeValue);
    }
}
