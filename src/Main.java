import java.util.Scanner;

public class Main extends Board{

    static int[] columnA = new int[2];
    static int[] columnB = new int[2];
    static int[] columnC = new int[2];
    static int[] row = new int[2];

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Board ticTacToe = new Board();


        while (true) {
            System.out.println("Lets play TicTacToe");
            ticTacToe.printBoard();

            System.out.println("Player 1, please place a tile.");
            String tile = userInput.next();
            tileInput(tile);

            System.out.println("Player 2, please select your tile");
            String playerTwoTile = userInput.next();
            tile = playerTwoTile;
            tileInput(tile);


        }

    }


    public static char tileInput(String tile){
        char columnInput= tile.charAt(0);
        char rowInputAsChar = tile.charAt(1);
        int rowInput = Character.getNumericValue(rowInputAsChar);
        char markedTile;

        if (columnInput == 'a' || columnInput == 'A') {
            int row[] =  columnA;
        } else if (columnInput == 'b' || columnInput == 'B'){
            int row[] = columnB;
        } else if (columnInput == 'c' || columnInput == 'C'){
            int row[] = columnC;
        }

        if (row.equals(columnA)){
            switch (rowInput){
                case 1:
                    markedTile = a1;
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } else if (row.equals(columnB)){
            switch (rowInput){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } else if (row.equals(columnC)) {
            switch (rowInput) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }


        }
    }

