    import java.util.*;
     
    public class Main {
        public static void main(String[] args)  {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[] h = new int[n];
            int[] dp = new int[n];
            for(int i=0;i<n;i++)    h[i] = in.nextInt();
            for(int i=1;i<=k && i<n;i++)   {
                dp[i] = Math.abs(h[i] - h[0]);
            }
            solve(n, k, h, dp);
            System.out.println(dp[n-1]);
            in.close();
        }
     
        static void solve(int n, int k, int[] h, int[] dp) {
            for(int i=k+1;i<n;i++)    {
                int min = Integer.MAX_VALUE;
                int temp;
                for(int j=1;j<=k;j++)    {
                    temp = Math.abs(h[i]-h[i-j]) + dp[i-j];
                    if(temp<min)    min = temp;
                }
                dp[i] = min;
            }
        }
    }