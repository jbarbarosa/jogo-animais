package tree;

public class Tree {

    private Node root;

    public Tree() {
        this.root = new Node("O animal que você pensou vive na terra?");
        this.root.setRight(new Node("O animal que você pensou é o macaco?"));
        this.root.setLeft(new Node("O animal que você pensou é o tubarão?"));
    }

    public Node getRoot() { return this.root; }

    public void setRoot(Node node) { this.root = node; }

}
