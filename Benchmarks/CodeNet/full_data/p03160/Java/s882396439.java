import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

class Main {

    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    static int get(String s)
    {
        return Integer.parseInt(s);
    }
    static long max(long a,long b)
    {
        return Long.max(a, b);
    }
    static int max(int a,int b,int c)
    {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) throws Exception 
    
    {
        PrintWriter p = new PrintWriter(System.out);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        Object[] nw = Arrays.stream(bf.readLine().split(" ")).map(Integer::parseInt).toArray();
        int a =  (int)nw[0];
        int b = (int)nw[1];
        // int n = Integer.parseInt(bf.readLine());
        int[] w = new int[a],v = new int[a];
        // p.printf("%d %d \n",n,w);
        for (int i = 0; i < a; i++) {
            String[] temp = bf.readLine().split(" ");
            w[i] = get(temp[0]);
            v[i] = get(temp[1]);
            // c[i] = get(temp[2]);

        }
        
        long dp[] = new long[110000];
        for (int i = 0; i < a;  i++) 
        {
            for (int j = b; j >= 0; j--)
            {
                if(j+w[i] <= b)
                    dp[j+w[i]] = max(dp[j+w[i]], dp[j]+v[i]);
            }
        }
       
        Long ret = Arrays.stream(dp).max().getAsLong();
        p.println(ret);
        p.flush();
    }
}