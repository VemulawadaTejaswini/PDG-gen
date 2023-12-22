import java.util.*;

public final class Main {

    static int N;

    static long C;

    static long x[];

    static long v[];


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        C = s.nextLong();

        x = new long[N];

        v = new long[N];

        long lastLoc = 0;

        long lastProfit = 0;


        long[] max = new long[N];

        int[] distance = new int[N];

        int maxLoc = 0;

        long maxProfit = 0;

        for (int i = 0; i < N; i++) {

            x[i] = s.nextLong();

            v[i] = s.nextLong();

            lastProfit += v[i];

            long localProfit = lastProfit - x[i];

            if (maxProfit <= localProfit) {

                maxProfit = localProfit;

                maxLoc = i;
            }

            max[i] = maxProfit;

            distance[i] = maxLoc;
        }

        long[] max2 = new long[N];

        int[] distance2 = new int[N];
        long resultMax = Math.max(0,maxProfit);

        long lastsum = 0;

        maxLoc = 0;

        maxProfit = 0;

        for (int b = N-1; b >=1; b--) {

            lastsum += v[b];

            long dist1 = C-x[b];
            long dist2 = x[distance[b-1]];

            long localmax = lastsum - dist1;

            if (maxProfit <= localmax) {

                maxLoc = b;

                maxProfit = localmax;
            }

            max2[b] = maxProfit;

            distance2[b] = maxLoc;

            long fd = dist1;

            long reverse =  max[b-1];

            long localresult = localmax + reverse - fd;

            resultMax = Math.max(localresult, resultMax);

        }

        lastsum = 0;

        resultMax = Math.max(resultMax, maxProfit);
        for (int a = 0; a < N-1; a++) {

            lastsum += v[a];

            long dist1 = x[a];
            long dist2 =  C - x[distance2[a+1]];

            long localmax = lastsum - dist1;

            long fd = dist1;

            long reverse =  max2[a+1];

            long localresult = localmax + reverse - fd;

            resultMax = Math.max(localresult, resultMax);


        }
        System.out.print(resultMax);
    }


}