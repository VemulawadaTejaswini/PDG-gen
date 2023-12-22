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

            if (maxProfit < localProfit) {

                maxProfit = localProfit;

                maxLoc = i;
            }

            max[i] = maxProfit;

            distance[i] = maxLoc;
        }

        long[] max2 = new long[N];

        int[] distance2 = new int[N];
        long resultMax = maxProfit;

        long lastsum = 0;

        maxLoc = 0;

        maxProfit = 0;

        for (int b = N-1; b >=0; b--) {

            lastsum += v[b];



            long dist1 = C-x[b];
            long dist2 = b >  0 ? x[distance[b-1]] : 0;

            long localmax = lastsum - dist1;

            if (maxProfit > localmax) {

                maxLoc = b;

                maxProfit = localmax;
            }

            max2[b] = maxProfit;

            distance2[b] = maxLoc;

            long fd = Math.min(dist2 ,dist1);

            long reverse = b  > 0 ? max[b-1] : 0;

            long localresult = localmax + reverse - fd;

            if (reverse - fd < 0) localresult = localmax;

            resultMax = Math.max(localresult, resultMax);


        }

        lastsum = 0;

        resultMax = Math.max(resultMax, maxProfit);
        for (int a = 0; a < N; a++) {

            lastsum += v[a];


            long dist1 = x[a];
            long dist2 = a < N-1 ? C - x[distance2[a+1]] : 0;

            long localmax = lastsum - dist1;

            long fd = Math.min(dist1, dist2);

            long reverse = a < N-1 ? max2[a+1] : 0;

            long localresult = localmax + reverse - fd;

            if (reverse -fd < 0)  localresult = localmax;

            resultMax = Math.max(localresult, resultMax);



        }
        System.out.print(resultMax);
    }


}