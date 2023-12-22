import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(backtrack(n, "0"));
    }

    private static int backtrack(int n, String digits) {
        if (digits.length() > 10) {
            return 0;
        }
        int val = Integer.parseInt(digits);
        if (val > n) {
            return 0;
        }
        int ans = 0;
        if (digits.contains("3") && digits.contains("5") && digits.contains("7")) {
            ans = 1;
        }

        ans += backtrack(n, digits + "3");
        ans += backtrack(n, digits + "5");
        ans += backtrack(n, digits + "7");
        return ans;
    }
}
