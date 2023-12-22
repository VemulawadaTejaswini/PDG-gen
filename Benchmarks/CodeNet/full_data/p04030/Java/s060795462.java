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
        String s = in.next().trim();
        Solver solver = new Solver();
        solver.solve(s);
        System.out.println(output);
    }

}

class Solver {
    public void solve(String s) {
        String ans = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'B') {
                ans += s.charAt(i);
            } else {
                // Delete last character
                if (ans.length() > 0) {
                    ans = ans.substring(0, ans.length() - 1);
                }
            }
        }
        Main.output.append(ans);
    }
}