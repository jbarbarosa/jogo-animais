package tree;

public class Tree {

    private Node root;

    public Tree() {
        this.root = new Node("vive na terra?");
        this.root.setRight(new Node("é o macaco?"));
        this.root.setLeft(new Node("é o tubarão?"));
    }

    public Node getRoot() { return this.root; }

    public void setRoot(Node node) { this.root = node; }

}
