import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();


        System.out.println(solve(S));
    }

    private static int solve(String S) {
        int count = 0;

        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == 'A' || S.charAt(i) == 'T' || S.charAt(i) == 'C' || S.charAt(i) == 'G') {
                for (int j=i; j<S.length(); j++) {
                    if (S.charAt(j) == 'A' || S.charAt(j) == 'T' || S.charAt(j) == 'C' || S.charAt(j) == 'G') {
                        // System.err.println("i=" + i + ", j=" + j + ", val=" + (j-i+1));
                        count = Math.max(count, j-i+1);
                    } else {
                        break;
                    }
                }
            }
        }

        return count;
    }
}