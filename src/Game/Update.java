package Game;

import tree.Node;

import java.util.ArrayList;

public class Update {

    public static void updateNode(Node node, ArrayList<String> updateWith) {
        Node parent = node.getPrevious();
        Node clue = new Node(updateWith.get(0));
        Node animal = new Node(updateWith.get(1));
        clue.setRight(animal);
        animal.setPrevious(clue);
        node.setPrevious(clue);
        clue.setLeft(node);
        clue.setPrevious(parent);
        invertClueAndLeaf(parent, node, clue);
    }

    private static void invertClueAndLeaf(Node parent, Node leaf, Node clue) {
        boolean res = isNodeParentsLeftChildren(parent, leaf);
        if(res) {
            parent.setLeft(clue);
        } else {
            parent.setRight(clue);
        }
    }

    private static boolean isNodeParentsLeftChildren(Node parent, Node node) {
        System.out.println("parent "+parent.getValue());
        String parentLeftValue = parent.getLeft().getValue();
        System.out.println("parent left: "+parentLeftValue);
        String nodeValue = node.getValue();
        System.out.println("node: "+nodeValue);
        return parentLeftValue.equals(nodeValue);
    }
}
