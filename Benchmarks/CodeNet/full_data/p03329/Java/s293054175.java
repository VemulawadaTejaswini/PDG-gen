
import java.io.*;
import java.util.*;

public class Main
{
    static int N;
    static List<Integer> nlist;
    static int[] dp;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nlist = new ArrayList<>();

        //使える数のリストを作り、ソート
        int n9 = 1, n6 = 1;
        while (n9 * 9 <= N)
        {
            n9 *= 9;
            nlist.add(n9);
        }
        while (n6 * 6 <= N)
        {
            n6 *= 6;
            nlist.add(n6);
        }
        nlist.add(1);
        Collections.sort(nlist);

        //dp
        dp = new int[N + 1];
        for (int i = 0; i < N; i++)
        {
            for (int li = 0; li < nlist.size(); li++)
            {
                int v = nlist.get(li);
                if (i + v > N) break;

                if (dp[i + v] == 0) dp[i + v] = dp[i] + 1;
                else dp[i + v] = Math.min(dp[i + v], dp[i] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}

