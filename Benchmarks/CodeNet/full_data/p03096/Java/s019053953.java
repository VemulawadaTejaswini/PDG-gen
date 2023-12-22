import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = 1000000007;
        int[] c = new int[n]; //c[i] -> i番目の色
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt() - 1;
        }
        long[] x = new long[200000]; //x[i] -> ここまでの色iの直前のansの総和
        long[] ans = new long[n]; //ans[i] -> i番目までの数字での並び方の総数
        x[c[0]] = 1;
        int last = c[0];
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1];// + Math.max(0, 2 * x[c[i]] - 1);
            if(last != c[i]){
                ans[i] += x[c[i]];
                x[c[i]] += ans[i-1];
                x[c[i]] %= mod;
                last = c[i];
            }
            ans[i] %= mod;
        }
        System.out.println(ans[n-1]);
    }
}