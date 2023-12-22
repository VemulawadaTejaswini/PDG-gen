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

    private static long solve(String S) {
        long sum = 0;

        int top = 0;
        for (int i=0; i<S.length();) {
            char ch = S.charAt(i);
            int count = 1;

            for (int j=i+1; j<S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) count++;
                else break;
            }

            if (ch == '<') {
                sum += (count+1) * (0 + count) / 2;
                top = count;
                // System.err.println("<: sum += " + (count * (count+1) / 2));
            } else {
                sum += (count+1) * (0 + count) / 2;
                if (top < count) {
                    sum -= top;
                } else {
                    sum -= count;
                }
                // System.err.println(">: sum += " + (count * (count+1) / 2) + " - " + Math.min(top, count));
            }

            i += count;
        }

        return sum;
    }
}