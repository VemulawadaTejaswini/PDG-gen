
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
   
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        double c = Math.PI * 2 * in.nextInt();
        out.println(c);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
