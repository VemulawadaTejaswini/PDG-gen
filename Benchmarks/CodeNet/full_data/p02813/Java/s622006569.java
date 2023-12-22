import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.function.BiConsumer;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int N = Integer.parseInt(in.next());
            int[] P = new int[N];
            int[] Q = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < N; i++) {
                Q[i] = Integer.parseInt(in.next());
            }
            int ans = 0;

            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = i + 1;
            }
            int i = 0;
            int a = 0, b = 0;
            do {
                if (Arrays.equals(array, P)) {
                    a = i;
                }
                if (Arrays.equals(array, Q)) {
                    b = i;
                }
                i++;
            } while (nextPermutation(array));

            ans = Math.abs(b - a);
            // 出力
            out.println(ans);

        }

        static boolean nextPermutation(int[] array) {
            if (array.length <= 1) {
                return false;
            }
            BiConsumer<Integer, Integer> swap = (a, b) -> {
                int temp = array[a];
                array[a] = array[b];
                array[b] = temp;
            };
            int last = array.length;
            int i = last - 1;
            while (true) {
                int j = i;
                i--;
                if (array[i] < array[j]) {
                    int k = last;
                    while (array[i] >= array[--k]) ;
                    swap.accept(i, k);
                    while ((j != last) && (j != --last)) {
                        swap.accept(j++, last);
                    }
                    return true;
                }
                if (i == 0) {
                    int first = 0;
                    while ((first != last) && (first != --last)) {
                        swap.accept(first++, last);
                    }
                    return false;
                }
            }
        }

    }
}

