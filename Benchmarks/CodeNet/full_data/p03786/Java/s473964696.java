import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        long[] dp = new long[N+1];
        for (int i=0;i<N;i++) {
            dp[i+1] = dp[i]+A[i];
        }

        int ans = 0;
        for (int i=1;i<N;i++) {
            if (dp[i]*2>=A[i]) ans++;
            else ans=0;
        }
        System.out.println(ans+1);
    }
}