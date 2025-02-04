import java.util.*;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] A = sc.next().toCharArray();
        final int N = A.length;
        final int[] next = new int[N];
        final int[] min = new int[N + 1];
        final int[] jump = new int[26];
        final char[] cs = new char[N];
        Arrays.fill(jump, N);
        for (int i = N - 1; i >= 0; i--) {
            int m = Integer.MAX_VALUE;
            int n = -1;
            for (int j = 0; j < 26; j++)
                if (min[jump[j]] + 1 < m) {
                    n = j;
                    m = min[jump[j]] + 1;
                }
            next[i] = jump[n];
            min[i] = m;
            jump[A[i] -'a'] = i;
            cs[i] = (char)(n + 'a');
        }
        int m = Integer.MAX_VALUE;
        int n = -1;
        for (int j = 0; j < 26; j++)
            if (min[jump[j]] + 1 < m) {
                n = j;
                m = min[jump[j]] + 1;
            }
//        System.err.println(m);
        final StringBuilder sb = new StringBuilder().appendCodePoint(n + 'a');
        for(int i = jump[n]; i < N; i = next[i])
            sb.append(cs[i]);
        System.out.println(sb);
    }
}
public class Main {
    public static void main(String... args) {
        C.main(args);
    }
}