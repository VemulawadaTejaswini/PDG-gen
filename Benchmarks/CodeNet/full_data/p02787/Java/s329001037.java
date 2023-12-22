import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }


    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        Main obj = new Main();
        int h=s.nextInt();
        int n=s.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=s.nextInt();
            arr[i][1]=s.nextInt();
        }
        long[] dp=new long[h+1];
        Arrays.fill(dp,Long.MAX_VALUE);
        for(int i=0;i<n;i++)
        {
            if(h-arr[i][0]>0)
            {
                dp[h-arr[i][0]] = Math.min(dp[h-arr[i][0]],arr[i][1]);
            }
            else
            {
                dp[0] =Math.min(dp[0],arr[i][1]);
            }
        }

        for(int i=h;i>0;i--)
        {
            if(dp[i]!=Long.MAX_VALUE)
            {
                for(int j=0;j<n;j++)
                {
                    if(i-arr[j][0]>0)
                    dp[i-arr[j][0]] = Math.min(dp[i-arr[j][0]],dp[i]+arr[j][1]);
                    else
                    {
                        dp[0]=Math.min(dp[0],dp[i]+arr[j][1]);
                    }
                }

            }

        }
        System.out.println(dp[0]);



    }


}