package Game;

import cmd.Prompt;
import tree.Node;
import tree.Tree;

import java.util.Objects;
import java.util.Optional;

public class Game {

    private Tree tree;

    private Next parser;

    public Game() {
        this.tree = new Tree();
        this.parser = new Next();
    }

    public void start() {
        System.out.println("Pense em um animal...");
        String response = Prompt.getResponse(this.tree.getRoot().getValue());
        Node current = this.tree.getRoot();
        while (true) {
            if (response.equals("q")) break;
            Optional<Node> node = this.parser.evaluate(response, current);
            if (this.parser.checkGameOverSuccess(response, node)) {
                System.out.println("Acertei!");
                this.start();
                break;
            } else if (this.parser.checkSuccessAndFollowing(response, node)) {
                current = node.get();
                response = Prompt.getResponse(current.getValue());
            }
        }
    }
}
