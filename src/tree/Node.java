package tree;

import java.util.Optional;
//Esta classe contém um valor, que pode tanto ser um galho (leva a outros nós abaixo),
//quanto pode ser uma folha (contém o nome de um animal)
//Além disso, o nó possui ponteiros para até três outros: seu pai, e dois filhos
//Seus métodos servem basicamente para operar esses valores, nenhuma lógica a mais ocorre aqui
public class Node {

    private Node previous;

    private final String value;

    private Node left;

    private Node right;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() { return right; }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
