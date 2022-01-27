package tree;

//Como o jogo se resume a escolher sempre dois caminhos até se exaurirem as opções
//uma árvore binária representa corretamente a organização das pistas e dos animais
//A árvore apenas precisa do ponteiro de sua raíz, e, a partir dela, é possível
//percorrer todos os nós
public class Tree {

    private final Node root;

    public Tree() {
        this.root = new Node("vive na terra?");
        this.root.setRight(new Node("é o macaco?"));
        this.root.setLeft(new Node("é o tubarão?"));
        this.bindRoot();
    }

    public Node getRoot() { return this.root; }

    //Define-se a raíz como nó pai dos dois nós iniciais, para que se possa subir
    //até o topo da árvore
    private void bindRoot() {
        this.getRoot().getRight().setPrevious(this.getRoot());
        this.getRoot().getLeft().setPrevious(this.getRoot());
    }
}
