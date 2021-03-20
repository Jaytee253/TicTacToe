import java.util.Scanner;

public class Main extends Board{

   
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Board ticTacToe = new Board();
        makeArray(tiles);
        System.out.println("Let's play TicTacToe!");
        ticTacToe.printBoard();

        while (!Board.gameSet){

            System.out.println("Player 1, please place a tile.");
            String playerOneTile = userInput.next();
            String tile = playerOneTile;
            turn = 1;
            tileInput(tile, tiles, playerOneTile, turn);
            ticTacToe.printBoard();
            ifGameIsWon(Board.gameSet);
            
            if (gameSet){
                break;
            }

            System.out.println("Player 2, please select your tile");
            String playerTwoTile = userInput.next();
            tile = playerTwoTile;
            turn = 2;
            tileInput(tile, tiles, playerOneTile, turn);
            ticTacToe.printBoard();
            ifGameIsWon(Board.gameSet);
            
            
        }  
        
        userInput.close();
             
    }
        



    public static void tileInput(String tile, boolean[] tiles, String playerOneTile, int turn){
        char columnInput= tile.charAt(0);
        char rowInputAsChar = tile.charAt(1);
        int rowInput = Character.getNumericValue(rowInputAsChar);
        char markedTile = ' ';
        
        
        if (turn == 1) {
            markedTile = 'X';
        } else {
            markedTile = 'O';
        }

        if (columnInput == 'a' || columnInput == 'A'){
            switch (rowInput){
                case 1:
                a1 = markedTile;
                tiles[0] = true;
                
                break;

                case 2:
                a2 = markedTile;
                tiles[1] = true;
                break;

                case 3:
                a3 = markedTile;
                tiles[2] = true;
                break;

                default:
                markedTile = ' ';
                break;
            }
        } else if (columnInput == 'b'|| columnInput == 'B'){
            switch (rowInput){
                case 1:
                b1 = markedTile;
                tiles[3] = true;
                break;

                case 2:
                b2 = markedTile;
                tiles[4] = true;
                break;

                case 3:
                b3 = markedTile;
                tiles[5] = true;
                break;

                default:
                markedTile = ' ';
                break;
            }
        } else if (columnInput == 'c' || columnInput == 'C'){
            switch (rowInput){
                case 1:
                c1 = markedTile;
                tiles[6] = true;
                break;

                case 2:
                c2 = markedTile;
                tiles[7] = true;
                break;

                case 3:
                c3 = markedTile;
                tiles[8] = true;
                break;

                default:
                markedTile = ' ';
                break;
            } 
                
            } else {
                markedTile = ' ';
            }
        
        }
          

}

