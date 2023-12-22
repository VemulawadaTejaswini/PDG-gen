import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        boolean ans = false;
        int n = in.nextInt();
        while (n > 0) {
            if (n % 10 == 7) {
                ans = true;
                break;
            }
            n /= 10;
        }

        out.println(ans ? "Yes" : "No");
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
