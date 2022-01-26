package Game;

import tree.Node;

import java.util.Objects;
import java.util.Optional;

public class Next {

    public Optional<Node> evaluate(String response, Node current) {
        if (Objects.equals(response, "s")) {
            return current.getRight();
        } else {
            return current.getLeft();
        }
    }

    public boolean checkGameOverSuccess(String response, Optional<Node> next) {
        System.out.println("response: " + response);
        if (response.equals("s") && next == null) {
            return true;
        }
        return false;
    }

    public boolean checkFollowing(Optional<Node> next) {
        if (next != null) {
            return true;
        }
        return false;
    }

    public boolean checkFailureAndGameOver(String response, Optional<Node> next) {
        if (response.equals("n") && next == null) {
            return true;
        }
        return false;
    }
}
