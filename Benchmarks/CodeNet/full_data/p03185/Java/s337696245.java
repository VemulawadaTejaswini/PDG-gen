    import java.util.*;
     
    public class Main {
        public static void main(String[] args)  {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            long c = in.nextLong();
            int[] h = new int[n];
            long[] dp = new long[n];
            for(int i=0;i<n;i++)    h[i] = in.nextInt();
            dp[1] = (long)Math.pow(h[1] - h[0], 2) + c;
            solve(n, c, h, dp);
            System.out.println(dp[n-1]);
            in.close();
        }
     
        static void solve(int n, long c, int[] h, long[] dp) {
            for(int i=2;i<n;i++)    {
                long min = Long.MAX_VALUE;
                long temp;
                for(int j=0;j<i;j++)    {
                    temp = (long)Math.pow(h[i]-h[j], 2) + dp[j] + c;
                    if(temp<min)    min = temp;
                }
                dp[i] = min;
            }
        }
    }