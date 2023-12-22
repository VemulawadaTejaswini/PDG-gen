import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int[] ans = solve(S);
        for (int i=0; i<ans.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(ans[i]);
        }
        System.out.println();

    }

    private static int[] solve(String S) {
        int[] ans = new int[S.length()];
        for (int i=0; i<ans.length; i++) {
            ans[i] = 1;
        }

        for (int i=0; i<S.length()-1; i++) {
            if (S.charAt(i) == 'L') continue;
            if (S.charAt(i+1) == 'L') continue;

            ans[i+2] += ans[i];
            ans[i] = 0;
        }
        for (int i=S.length()-1; i>0; i--) {
            if(S.charAt(i) == 'R') continue;
            if(S.charAt(i-1) == 'R') continue;

            ans[i-2] += ans[i];
            ans[i] =0;
        }

        return ans;
    }
}