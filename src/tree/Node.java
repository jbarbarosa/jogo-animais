package tree;

import java.util.Optional;

public class Node {

    private String value;

    private Optional<Node> left;

    private Optional<Node> right;

    public Node() {}

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Optional<Node> getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = Optional.of(left);
    }

    public Optional<Node> getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = Optional.of(right);
    }
}
