import java.util.*;

public class Main {
    static long MOD = (int)1e9+7;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        long ans = 0;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                ans += arr[i]^arr[j];
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }
}
