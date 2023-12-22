import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.util.*;

public class Main {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next().trim();
        String b = in.next().trim();
        String c = in.next().trim();
        Solver solver = new Solver();
        solver.solve(a, b, c);
        System.out.println(output);
    }

}

class Solver {
    public void solve(String a, String b, String c) {
        String ans = "";
        char start = a.charAt(0);
        int aa = 1;
        int bb = 0;
        int cc = 0;

        while (true) {
            if (start == 'a') {
                aa++;
                start = a.charAt(aa);
            } else if (start == 'b') {
                bb++;
                start = b.charAt(bb);
            } else {
                cc++;
                start = c.charAt(cc);
            }
            if (aa == a.length() - 1) {
                ans = "A";
                break;
            } else if (bb == b.length() - 1) {
                ans = "B";
                break;
            } else if (cc == c.length() - 1) {
                ans = "C";
                break;
            }

        }
        Main.output.append(ans);
    }
}