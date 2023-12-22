import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEroui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            char[] arr = in.next().toCharArray();

            StringBuilder sb = new StringBuilder();
            Stack<Character> stk = new Stack<>();
            StringBuilder ans = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
                if (c == '(') {
                    stk.push(c);
                } else if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    ans.append('(');
                }
            }

            while (!stk.isEmpty()) {
                sb.append(')');
                stk.pop();
            }

            out.println(ans.toString() + "" + sb.toString());

        }

    }
}

