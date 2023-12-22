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
        System.out.println(output.reverse());
    }

}

class Solver {
    public void solve(String s) {
        String ans = "";
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'B') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                    continue;
                } else {
                    ans = ans.concat(Character.toString(s.charAt(i)));
                }
            }
        }
        Main.output.append(ans);
    }
}