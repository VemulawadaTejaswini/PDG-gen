import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextLong();
        long[] dp = new long[1000];
        //initialize
        for(int i = 0; i < 1000; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        dp[1] = 1;
        
        System.out.println(solve(h));
        
    }

    public static long solve(long x) {
        if(x == 1) {
            return 1;
        } else {
            return 2 * solve(x/2) + 1;
        }
    }

}
