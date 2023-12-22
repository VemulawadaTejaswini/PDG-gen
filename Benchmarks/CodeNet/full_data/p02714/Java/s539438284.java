import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        System.out.println(solve(N, S));
    }

    private static long solve(int N, String S) {
        long count = 0;

        first: for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    continue;
                }

                for (int k=j+1; k<N; k++) {
                    if (k == j+ (j-i)) continue;

                    if (k >= N) continue first;
                    if (S.charAt(i) != S.charAt(j) && S.charAt(j) != S.charAt(k) && S.charAt(k) != S.charAt(i)) {
                        count++;
                    }
                }

            }
        }

        return count;
    }
}