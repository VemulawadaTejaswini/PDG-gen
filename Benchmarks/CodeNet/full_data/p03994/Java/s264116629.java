import java.util.Scanner;

/**
 * Created on 16/09/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int K = sc.nextInt();

        String result = solve(s, K);

        System.out.println(result);
    }

    private static String solve(String s, int K) {
        return solveIter(new StringBuffer(s), K, 0);
    }

    private static String solveIter(StringBuffer s, int K, int idx) {
        if (K == 0) {
            return s.toString();
        }
        if (idx == s.length()) {
            int cint = s.charAt(idx-1) + (K%26);
            cint = cint > 'z' ? cint - ('z' - 'a' + 1) : cint;
            String c = Character.toString((char)cint);
            return s.replace(idx-1, idx, c).toString();
        }

        if (s.charAt(idx) == 'a') {
            return solveIter(s, K, idx+1);
        }

        if ('z' - s.charAt(idx) + 1 <= K) {
            char c = s.charAt(idx);
            return solveIter(s.replace(idx, idx+1, "a"), K - ('z' - c + 1), idx+1);
        }

        return solveIter(s, K, idx+1);
    }
}
