//Created by Aminul on 8/14/2019.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class J {
    static double N;
    static int n;
    static double dp[][][];

    public static void main(String[] args) throws Exception {
        new Thread(null ,new Runnable(){
            public void run(){
                try{solveIt();} catch(Exception e){e.printStackTrace(); System.exit(1);}
            }
        },"Main",1<<28).start();
    }

    public static void solveIt() throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = in.nextInt();
        int a[] = new int[4];
        for (int i = 0; i < n; i++) {
            a[in.nextInt()]++;
        }
        dp = new double[n + 1][n + 1][n + 1];
        N = n;
        for (double x[][] : dp) for (double y[] : x) Arrays.fill(y, -1);
        pw.println(solve(a[1], a[2], a[3]));

        pw.close();
    }

    static double solve(int ones, int twos, int threes) {
        if (ones == 0 && twos == 0 && threes == 0) return 0;
        if (dp[ones][twos][threes] != -1) return dp[ones][twos][threes];
        int zeros = n - ones - twos - threes;
        double e = 1;
        if (ones > 0) e += (ones / N) * solve(ones - 1, twos, threes);
        if (twos > 0) e += (twos / N) * solve(ones + 1, twos - 1, threes);
        if (threes > 0) e += (threes / N) * solve(ones, twos + 1, threes - 1);
        if (zeros > 0) e /= (1 - (zeros / N));
        return dp[ones][twos][threes] = e;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}