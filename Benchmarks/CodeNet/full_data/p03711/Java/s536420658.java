import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if ( x == 2 || y == 2) {
            out.println("No");
        } else if (( x == 4 || x == 6 || x == 9 || x == 11 ) && ( y == 4 || y == 6 || y == 9 || y == 11 )) {
            out.println("Yes");
        } else if ((x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12 ) && (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12 )) {
            out.println("Yes");
        } else {
            out.println("Not");
        }
        
        
        sc.close();
    }
}