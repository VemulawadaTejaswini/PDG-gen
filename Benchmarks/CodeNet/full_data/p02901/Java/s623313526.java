import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int allPattern = (int)Math.pow(2.0, N);
        long dp[] = new long[allPattern];
        Arrays.fill(dp, 0);

        Map<Integer, Integer> acMap = new TreeMap<Integer, Integer>();

        for(int i = 0 ; i < M; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = 0;
            for(int j = 0; j < b ; j++) {
                c += Math.pow(2.0, scan.nextInt()-1);
            }
            if (!acMap.containsKey(c))
                acMap.put(c, a);
            else {
                Integer prevA = (Integer)acMap.get(c);
                if (a < prevA)
                    acMap.put(c, a);
            }
        }


        for (int s = 0 ; s < allPattern; s++) {
            for (Entry<Integer, Integer> entry : acMap.entrySet()) {
                int t = s | entry.getKey();
                if(dp[s] != 0 || s == 0) {
                    if (dp[t] == 0 || (dp[t] != 0 && dp[t] > dp[s] + entry.getValue()))
                        dp[t] = dp[s] + entry.getValue();
                }
            }
        }

        if(dp[allPattern-1] != 0)
            os.println(dp[allPattern-1]);
        else
            os.println("-1");
    }
}