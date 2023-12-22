import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC_110_C solver = new ABC_110_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_110_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String sourceStr = in.next();
            String targetStr = in.next();
            char[] source = sourceStr.toCharArray();
            char[] target = targetStr.toCharArray();
            Map<Character, Character> mapper1 = new HashMap<>();
            Map<Character, Character> mapper2 = new HashMap<>();

            for (int i = 0; i < source.length; i++) {
                if (mapper1.containsKey(source[i])) {
                    if (mapper1.get(source[i]) != target[i]) {
                        out.print("No");
                        return;
                    }
                }
                if (mapper2.containsKey(target[i])) {
                    if (mapper2.get(target[i]) != source[i]) {
                        out.print("No");
                        return;
                    }
                }
                mapper1.put(source[i], target[i]);
                mapper2.put(target[i], source[i]);
            }
            out.print("Yes");
        }

    }
}

