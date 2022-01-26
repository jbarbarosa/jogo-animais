package tree;

public class Tree {

    private Node root;

    public Tree() {
        this.root = new Node("vive na terra?");
        this.root.setRight(new Node("é o macaco?"));
        this.root.setLeft(new Node("é o tubarão?"));
        this.bindRoot();
    }

    public Node getRoot() { return this.root; }

    private void bindRoot() {
        this.getRoot().getRight().setPrevious(this.getRoot());
        this.getRoot().getLeft().setPrevious(this.getRoot());
    }
}
