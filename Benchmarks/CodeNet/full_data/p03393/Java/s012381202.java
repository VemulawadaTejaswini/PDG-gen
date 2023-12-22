import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        ADiverseWord solver = new ADiverseWord();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADiverseWord {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            Character[] c = new Character[s.length()];
            NextPermutation<Character> np = new NextPermutation<>();
            for (int i = 0; i < s.length(); i++) {
                c[i] = s.charAt(i);
            }
            if (s.length() < 26) {
                for (char i = 'a'; i <= 'z'; i++) {
                    if (s.indexOf(i) == -1) {
                        out.println(s + i);
                        return;
                    }
                }
            } else {
                if (np.nextPermutation(c) == null) {
                    out.println(-1);
                } else {
                    for (int i = 0; i < 26; i++) {
                        out.print(c[i]);
                        if (s.charAt(i) != c[i]) break;
                    }
                    out.println();
                }
            }
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

