import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        sc.close();
        final int MOD = 1000000007;
        int result = 0;
        for(int i=0; i<=n-2; i++){
            for(int j=i; j<=n-1; j++){
                result += (a[i]^a[j])%MOD;
                result %= MOD;
            }
        }
        System.out.println(result);
    }
}