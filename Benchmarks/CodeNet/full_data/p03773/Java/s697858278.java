import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        out.println( (A + B) - ((A + B)/24)*24);
        
        
        sc.close();
    }
}