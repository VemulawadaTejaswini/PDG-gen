import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

// import 
class Main {


    static int min(int a,int b)
    {
        return Math.min(a, b);
    }

    static int abs(int a)
    {
        return Math.abs(a);
    }

    public static void main(String[] args) throws Exception {
        PrintWriter p = new PrintWriter(System.out);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        Integer arr[] = Arrays.stream(bf.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        int dp[] = new int[n+1];
        // int mod = 100000000+7;
        Arrays.fill(dp, Integer.MAX_VALUE); //fill large values in dp 
        dp[0] = 0;
        for (int i = 0; i < n; i++) 
        {
            if(i+1 < n )
                dp[i+1] =  min(dp[i+1],dp[i]+abs(arr[i]-arr[i+1]));
            if (i + 2 < n)
                dp[i + 2] = min(dp[i + 2], dp[i] + abs(arr[i] - arr[i+2]));

        }
        // System.out.println(Arrays.toString(dp));
        // System.out.println(dp[n-1]);
        p.println(dp[n-1]);
        p.flush();
    }
}