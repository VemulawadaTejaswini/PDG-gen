import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

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
        Triangles solver = new Triangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class Triangles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            Arrays.sort(array);

            long result = 0;
            for (int i = 0; i < array.length - 2; i++) {
                int a = array[i];
                for (int j = i + 1; j < array.length - 1; j++) {
                    int b = array[j];
                    for (int k = j + 1; k < array.length; k++) {
                        int c = array[k];
                        if (b - a < c && c < a + b) {
                            result++;
                        }
                    }
                }
            }

//        for (int i = 0; i < array.length; i++) {
//            int a = array[i];
//            for (int j = i + 1; j <  array.length; j++) {
//                int b = array[j];
//                int k = i;
//                while (k <  array.length && array[k] < a + b) {
//                    k++;
//                }
//                result += k - (j + 1);
//            }
//        }
            out.println(result);
        }

    }
}

