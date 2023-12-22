import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
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
            long A = in.nextLong();
            long B = in.nextLong();
            String bin;
            List<String> numList = new ArrayList<>();
            for (long i = A; i <= B; i++) {
                numList.add(Long.toBinaryString(i));
            }


            String lastNum = numList.get(numList.size() - 1);
            String result = "";
            for (int i = 0; i < lastNum.length(); i++) {
                int counter = 0;
                for (int j = 0; j < numList.size(); j++) {
                    if (numList.get(j).length() > i && numList.get(j).charAt(numList.get(j).length() - 1 - i) == '1') {
                        counter++;
                    }
                }
                if (counter % 2 == 0) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
            }

            out.println(Long.parseLong(result, 2));
        }

    }
}

