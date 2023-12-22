import java.util.Scanner;

public class Main {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] A = new int[n];
        int mod = 998244353;
        arr = new int[n + 1][n + 1];
        long ans = 0;
        for(int i = 0; i < n; i++) A[i] = Integer.parseInt(sc.next());
        for(int range = 0; range <= n; range++) {
            for(int i = 1; i + range <= n; i++) {
                int sum = 0;
                for(int j = i; j <= i + range; j++) sum += A[j - 1];
                if(sum == s) {
                    arr[i][i + range]++;
                }
                if(i != 1 && i + range != n) arr[i - 1][i + range + 1] += arr[i][i + range] % mod;
                if(i != 1) arr[i - 1][i + range] += arr[i][i + range] % mod;
                if(i + range != n) arr[i][i + range + 1] += arr[i][i + range] % mod;
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                ans += arr[i][j] % mod;
            }
        }
        System.out.println(ans);
    }
}