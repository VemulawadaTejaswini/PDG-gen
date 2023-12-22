import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] cumulativeSum = new long[n];

        long ans = 0;
        cumulativeSum[0] = sc.nextInt();
        if (cumulativeSum[0] == 0) {
            ans++;
        }

        for (int i = 1; i < n; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + sc.nextInt();
            if (cumulativeSum[i] == 0) {
                ans++;
            }
        }

        for (int i = 1; i < n; i++) {
            long target = cumulativeSum[i - 1];
            for (int j = i; j < n; j++) {
                if (cumulativeSum[j] == target) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}