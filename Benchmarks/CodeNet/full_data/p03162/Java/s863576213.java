using System;
using System.Linq;
using System.Collections.Generic;

class Cmondai
{
    static void Main()
    {
        var N = Int32.Parse(Console.ReadLine());
        var dp = new int[N,N];
        for (int i=0;i<N;++i)
        {
            var line = Console.ReadLine().Split(' ').Select(x => Int32.Parse(x)).ToArray();
            for (int j=1; j<=N;++j)
            {
                if (i == 0) dp[i, j] = line[j];
                else dp[i, j - 1] = Math.Max(dp[i - 1, j % 3], dp[i - 1, j % 3 + 1]);
            }
        }
        var ans = Math.Max(dp[N-1,0],
            Math.Max(dp[N-1,1],dp[N-1,2]));
        Console.WriteLine(ans);
    }
}