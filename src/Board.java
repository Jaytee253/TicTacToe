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
    public static boolean gameSet;
    public static boolean[] tiles = new boolean[8];

    public void printBoard(){
        System.out.println(" A   B   C  ");
        printRow(a1, b1, c1);
        System.out.println("---|---|---");
        printRow(a2, b2, c2);
        System.out.println("---|---|---");
        printRow(a3, b3, c3);
    }

    public static void printRow(char a, char b, char c){
        System.out.println(" " + a + " | " + b + " | " + c);
    }

    public static boolean[] makeArray(boolean[] tiles){
        for (int i = 0; i < 9; i++){
            tiles[i] = false;
        }

        return tiles;
    }

    public static boolean whoWon(boolean gameSet){
        
        

        return gameSet;
    }


}
