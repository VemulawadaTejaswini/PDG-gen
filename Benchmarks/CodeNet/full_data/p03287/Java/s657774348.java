 import java.util.*;
class Main
{
    static int MOD = 1000000007;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[m];
        int[] sum = new int[n+1];
        long ans = 0;
        sum[0] = 0;
        for(int i = 1; i < n+1; i++){
            sum[i] = (sum[i-1] + sc.nextInt()) % m;
        }
        for(int i = 0; i < n+1; i++){
            ans += a[sum[i]];
            a[sum[i]]++;
        }
        System.out.println(ans);
    }
}