import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer> aList = new ArrayList<>();

        for (int i=0; i<M; i++) {
            aList.add(scanner.nextInt());
        }

        long[] dp = new long[N+2];
        dp[N+1] = 0;
        dp[N] = 1;
        for (int i=N-1; i >= 0; i--) {
            if (aList.contains(i)) {
                continue;
            }
            dp[i] = dp[i+1] + dp[i+2];
        }
        System.out.println(dp[0] % 1000000007);
    }
}