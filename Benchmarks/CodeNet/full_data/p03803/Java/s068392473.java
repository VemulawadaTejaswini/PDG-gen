import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if(A == 1) {
            A += 13;
        } else if (B == 1) {
            B += 13;
        }
        if (A > B) {
            out.println("Alice");
        } else if (B > A) {
            out.println("Bob");
        } else if (A == B) {
            out.println("Draw");
        }
        

        sc.close();
    }
}