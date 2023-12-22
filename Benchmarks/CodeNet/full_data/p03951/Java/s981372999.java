import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        System.out.println(solve(N, s, t));
    }

    private static int solve(int N, String s, String t) {
        int count = 0;

        for (count = N; count>0; count--) {
            String subs = s.substring(N - count, N);
            String subt = t.substring(0, count);
            // System.err.println(subs + ", " + subt);

            if (subs.equals(subt)) {
                break;
            }
        }

        return s.length() + t.length() - count;
    }
}