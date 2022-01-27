package Game;

import tree.Node;

import java.util.Objects;
import java.util.Optional;

public class Next {

    //Esse método decide qual ramo da árvore seguir, "s" para a direita e "n" para esquerda
    public Node evaluate(String response, Node current) {
        if (Objects.equals(response, "s")) {
            return current.getRight();
        } else {
            return current.getLeft();
        }
    }

    //Determina se o usuário respondeu com "s" em um Node folha, encerrando com vitória
    public boolean checkGameOverSuccess(String response, Node next) {
        System.out.println("response: " + response);
        if (response.equals("s") && next == null) {
            return true;
        }
        return false;
    }

    //Metódo que serve de guarda para verificar se há um nó seguinte
    public boolean checkFollowing(Node next) {
        if (next != null) {
            return true;
        }
        return false;
    }

}
