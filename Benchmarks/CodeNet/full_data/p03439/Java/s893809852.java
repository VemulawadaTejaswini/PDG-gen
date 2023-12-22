import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        solve(sc, N);
    }

    private static void solve(Scanner sc, int N) {
        String leftVal, rightVal;
        String ans;

        System.out.println(0);
        System.out.flush();
        leftVal= sc.next();
        if (leftVal.equals("Vacant")) return;

        System.out.println(N/2);
        System.out.flush();
        rightVal = sc.next();
        if (rightVal.equals("Vacant")) return;


        int left = 0;
        int right = N;
        if (leftVal.equals(rightVal)) {
            right = N/2;
        } else {
            String tmp = leftVal;
            leftVal = rightVal;
            rightVal = tmp;
            left = N/2;
        }

        // System.err.println(left + ", " + right);
        while(right - left > 1) {
            int num = right - left + 1;
            int mid = (right+left)/2;
            System.out.println(mid);
            System.out.flush();

            String input = sc.next();
            if (input.equals("Vacant")) {
                return;
            }

            if (input.equals(leftVal)) {
                if (left == mid) break;

                left = mid;
                leftVal = input;
            } else {
                right = mid;
                rightVal = input;
            }
        }

        System.out.println(right%N);
    }
}