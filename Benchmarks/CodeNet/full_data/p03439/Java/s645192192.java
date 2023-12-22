import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        solve2(sc, N);
    }

    private static void solve2(Scanner sc, int N) {
        System.out.println(0);
        String leftString = sc.next();
        if (leftString.equals("Vacant")) {
            return;
        }

        int left = 1;
        int right = N;
        while (true) {
            int mid = (left+right)/2;
            System.out.println(mid);
            String ans = sc.next();
            if (ans.equals("Vacant")) return;

            if (mid%2 == 0 && leftString.equals(ans)
                    || mid%2 != 0 && !leftString.equals(ans)) {
                leftString = ans;
                left = mid;
            } else {
                right = mid;
            }
        }
    }
}