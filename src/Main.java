import Game.Game;

public class Main {

    //Espalhei comentários como esse para explicar minhas intenções com o código.
    //Normalmente, meu código tem zero ou pouquíssimos comentários, mas, para fins
    //explicativos, coloquei estes aqui por serem a melhor maneira de me expressar.

    //A função main não deve ter lógica além do necessário. No caso desta, ela apenas
    //inicializa a classe principal Game.
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
