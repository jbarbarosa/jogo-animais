package Game;

import tree.Node;

import java.util.ArrayList;

public class Update {

    public static void updateNode(Node node, ArrayList<String> updateWith) {
        Node parent = node.getPrevious(); //vive na terra
        Node clue = new Node(updateWith.get(0)); //voa
        Node animal = new Node(updateWith.get(1)); //aguia
        clue.setRight(animal); // voa -> s -> aguia
        animal.setPrevious(clue);
        node.setPrevious(clue);
        clue.setLeft(node); // voa -> n -> macaco
        parent.setLeft(clue); //vive na terra -> n ->
        clue.setPrevious(parent);
    }
}
