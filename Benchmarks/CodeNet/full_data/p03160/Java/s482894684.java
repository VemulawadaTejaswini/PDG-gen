
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class d_knapsack {
    static long wt[];
    static int val[];
    static HashMap<String,Long> dp ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        wt = new long[N];
        val = new int[N];
        dp = new HashMap<>();
        for(int i = 0 ; i < N ; i++)
        {
            wt[i] = sc.nextLong();
            val[i] = sc.nextInt();
        }
        System.out.println(knapSack(W , N));

    }

    static long knapSack(long W, int n)
    {
        String s =  W+" "+n;
        if(dp.containsKey(s))
            return dp.get(s);

        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n-1] > W)
        {
            long ans = knapSack(W, n-1);
            dp.put(s , ans);
            return ans;
        }

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else {
            long ans = Math.max( val[n-1] + knapSack(W-wt[n-1], n-1),
                    knapSack(W, n-1));
            dp.put(s , ans);
            return ans;
        }
    }
}
