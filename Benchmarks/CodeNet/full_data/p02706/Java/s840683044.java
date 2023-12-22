
import java.util.*;
import java.io.*;

/**
 * Made by egor https://github.com/chermehdi/egor.
 * 
 * @author Azuz
   
 */
public class Main {

    void solve(Scanner in, PrintWriter out) {
        int m = in.nextInt();
        long n = in.nextInt();
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += in.nextInt();
        }

        out.println(sum > m ? -1 : m - sum);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
