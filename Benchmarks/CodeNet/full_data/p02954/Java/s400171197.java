import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DGatheringChildren solver = new DGatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGatheringChildren {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            char[] S = in.next().toCharArray();
            int n = S.length;
            int[] ans = new int[n];

            for (int i = 0; i < 2; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (S[j] == 'R') {
                        cnt++;
                    } else {
                        ans[j] += cnt / 2;
                        ans[j - 1] += (cnt + 1) / 2;
                        cnt = 0;
                    }
                }
                reverse(S);
                reverse(ans);
                for (int j = 0; j < n; j++) {
                    if (S[j] == 'L') S[j] = 'R';
                    else S[j] = 'L';
                }
            }


            for (int i = 0; i < n; i++) {
                out.printf("%d ", ans[i]);
            }
            out.printf("\n");
        }

        void reverse(char[] array) {
            for (int i = 0; i < array.length / 2; i++) swap(array, i, array.length - i - 1);
        }

        void reverse(int[] array) {
            for (int i = 0; i < array.length / 2; i++) swap(array, i, array.length - i - 1);
        }

        void swap(int[] array, int i, int j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        void swap(char[] array, int i, int j) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

    }
}

