public class Board {

    public static char a1 = ' ';
    public static char a2 = ' ';
    public static char a3 = ' ';
    public static char b1 = ' ';
    public static char b2 = ' ';
    public static char b3 = ' ';
    public static char c1 = ' ';
    public static char c2 = ' ';
    public static char c3 = ' ';
    public static int turn;
    public static boolean gameSet = false;
    public static boolean[] tiles = new boolean[9];
    
    

    public void printBoard(){
        System.out.println("  A   B   C  ");
        printRow(a1, b1, c1, 1);
        System.out.println(" ---|---|---");
        printRow(a2, b2, c2, 2);
        System.out.println(" ---|---|---");
        printRow(a3, b3, c3, 3);
    }

    public static void printRow(char a, char b, char c, int i){
        System.out.println(i + " " + a + " | " + b + " | " + c);
    }

    public static boolean[] makeArray(boolean[] tiles){
        for (int i = 0; i < 9; i++){
            tiles[i] = false;
        }

        return tiles;
    }

    public static void inputValidation() {

    }

    public static boolean ifGameIsWon(boolean gameSet){
        
        if (a1 != ' ' && a1 == a2 && a1 == a3){
            Board.gameSet = true;
        } else if (b1 != ' ' && b1 == b2 && b1 == b3 ){
            Board.gameSet = true;    
        } else if (c1 != ' ' && c1 == c2 && c1 == c3){
            Board.gameSet = true;
        } else if (a1 != ' ' && a1 == b1 && a1 == c1){
            Board.gameSet = true;
        } else if (a2 != ' ' && a2 == b2  && a2 == c2){
            Board.gameSet = true;
        } else if (a3 != ' ' && a3 == b3 && a3 == c3){
            Board.gameSet = true;
        } else if (a1 != ' ' && a1 == b2 && a1 == c3){
            Board.gameSet = true;
        } else if (a3 != ' ' && a3 == b2 && a3 == c1){
            Board.gameSet = true;
        } else if (tiles[1] && tiles[2] && tiles [3] && tiles[4] && tiles[5] && tiles[6] && tiles[7] && tiles[8] && tiles[9]){
            Board.gameSet = true;
            System.out.println("Tie");
        }

        if (gameSet) {
            switch (turn){
                case 1:
                System.out.println("Player 1 has won");
                break;
                case 2:
                System.out.println("Player 2 has won");
                break;
                default:
                System.out.println("Next player's turn");
                break;
            }
        }
        
        
        return gameSet;
    }


}