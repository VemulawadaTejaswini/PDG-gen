import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        int H, W;
        String line;

        H = sc.nextInt();
        W = sc.nextInt();

        line = sc.nextLine();
        for (int i = 0; i <= H; i++) {
            line = sc.nextLine();

            out.println(line + "\n" + line);
        }
        
        sc.close();
    }
}