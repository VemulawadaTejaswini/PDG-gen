import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A > B) {
            out.println("Alice");
        } else if (A < B) {
            out.println("Bob");
        } else if (A == B) {
            out.println("Draw");
        }
        

        sc.close();
    }
}