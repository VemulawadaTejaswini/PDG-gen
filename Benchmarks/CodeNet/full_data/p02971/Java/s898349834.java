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
        abc134_c solver = new abc134_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc134_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            //ArrayList<Integer> A = new ArrayList();
            int A[] = new int[N];
            int wA[] = new int[N];

            for (int i = 0; i < N; i++) {
                //A.add(in.nextInt());
                A[i] = in.nextInt();
                wA[i] = A[i];
            }
            Arrays.sort(wA);
            for (int i = 0; i < N; i++) {
                if (A[i] == wA[N - 1]) {
                    out.println(wA[N - 2]);
                } else {
                    out.println(wA[N - 1]);
                }
            }

        /*

        for (int i = 0; i < N; i++) {
            Arr
            WORK.clear();
            for (int j = 0; j < N; j++) {
               if (j!=i) {
                   WORK.add(A.get(i));
               }
            }
            Arrays.sort(WORK);
            out.println(Arrays.sort(WORK));

        }
        */
        }

    }
}

