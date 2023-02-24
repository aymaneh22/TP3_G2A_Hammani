import java.util.Scanner ;
public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;
    // On decrit brievement la logique du jeu

    private void createPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le nom du joueur 1 : ");
        Player player1 = new Player (scanner.nextLine(), 0);
        System.out.println("Saisissez le nom du joueur 2 : ");
        Player player2 = new Player (scanner.nextLine(), 1);
        this.currentPlayer = player1;
    }
    private void initialiseBoard(){
    for (int i=1; i<9; i++){
        for (int j=1; j<9; j++){
            board[i][j] = new Cell(new Position(i,j));
        }
    }
    }
    private boolean isCheckMate(){

    }
    private void printBoard(){

    }
    private String askMove(){

    }
    private boolean isValidMove(String move){

    }
    private void updateBoard(String move){

    }
    private void switchPlayer(){

    }
    public void play() {
        while (true) {
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }
// On declare et implemente les autres methodes mentionnees plus haut
}
