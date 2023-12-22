import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();


        System.out.println(solve(N, S));
    }

    private static int solve(int N, String S) {
        int maxLength = N/2;
        int count = 0;

        if (N>26) {
            count = 1;
        }

        for (int i=0; i<N; i++)
            for (int l=count; l<=maxLength; l++) {
                if (l == 0) {
                    l = 1;
                }
                if (i+2*l > N) {
                    // System.err.println("break with: i=" + i + ", l=" + l);
                    break;
                }
                String subString = S.substring(i, i+l);
                // System.err.println("substring = " + subString);
                if (S.substring(i+l).contains(subString)) {
                    count = Math.max(count, l);
                }

            }

        return count;
    }
}