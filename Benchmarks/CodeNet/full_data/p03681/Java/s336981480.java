import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), mod = 1000000007;
        long ans = 0;
        if(Math.abs(n - m) > 1) ans = 0;
        else{
            long nn = 1, mm = 1;
            for(int i = 1; i <= n; i++)
                nn = nn * i % mod;
            for(int i = 1; i <= m; i++)
                mm = mm * i % mod;
            if(n == m) ans = 2 * nn * mm % mod;
            else ans = n * m;
        }
        System.out.print(ans);
    }
}