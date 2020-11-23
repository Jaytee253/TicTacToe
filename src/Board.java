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

    private static char[] tiles = {a1, a2, a3, b1, b2, b3, c1, c2, c3};
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


}
