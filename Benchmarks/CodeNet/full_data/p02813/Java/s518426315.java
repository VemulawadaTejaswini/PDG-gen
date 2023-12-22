import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCountOrder solver = new CCountOrder();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCountOrder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Integer[] p = new Integer[n];
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            for (int i = 0; i < n; i++) p[i] = i + 1;
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < n; i++) b[i] = in.nextInt();

            NextPermutation<Integer> np = new NextPermutation<>();
            int ca = 0;
            int cb = 0;
            int cnt = 0;
            while (true) {
                if (Arrays.equals(p, a)) ca = cnt;
                if (Arrays.equals(p, b)) cb = cnt;
                cnt++;
                if (np.nextPermutation(p) == null) break;
            }

            out.println(Math.abs(ca - cb));
        }

    }

    static class NextPermutation<T extends Comparable<T>> {
        public T[] nextPermutation(T[] array) {
            int k = -1;
            int i = array.length - 2;
            while (i >= 0) {
                if (array[i].compareTo(array[i + 1]) < 0) {
                    k = i;
                    break;
                }
                i--;
            }

            // 存在しない場合nullを返す
            if (k == -1) return null;
            int l = k + 1;
            i = array.length - 1;
            while (i > k + 1) {
                if (array[k].compareTo(array[i]) < 0) {
                    l = i;
                    break;
                }
                i--;
            }

            T tmp = array[k];
            array[k] = array[l];
            array[l] = tmp;
            int[] res = new int[array.length];
            // k+1 <-> n-1
            for (int j = k + 1; j < array.length + k - j; j++) {
                tmp = array[j];
                array[j] = array[array.length + k - j];
                array[array.length + k - j] = tmp;
            }
            return array;
        }

    }
}

