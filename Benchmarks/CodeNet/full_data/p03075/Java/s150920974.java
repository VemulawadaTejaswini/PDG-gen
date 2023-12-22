import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            List<Integer> inputList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                inputList.add(in.nextInt());
            }
            int diffThr = in.nextInt();
            //Collection.sort(inputList);
            Collections.sort(inputList, new Comparator<Integer>() {

                public int compare(Integer a, Integer b) {
                    return a - b;
                }
            });

            //System.out.println(inputList.get(inputList.size() - 1) + ":" + inputList.get(0) );
            if (inputList.get(inputList.size() - 1) - inputList.get(0) <= diffThr) {
                out.println("Yay!");
            } else {
                out.println(":(");
            }
        }

    }
}

