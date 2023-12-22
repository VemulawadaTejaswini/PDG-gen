import java.util.*;

public final class Main {

    static int N;

    static long C;

    static long x[];

    static long v[];

    static class Point implements Comparable<Point>{

        int index;

        long max;

        public Point (int index , long max) {

            this.index = index;

            this.max = max;
        }

        public int compareTo(Point b) {

            Long m = b.max;

           return  m.compareTo(max);
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        C = s.nextLong();

        x = new long[N];

        v = new long[N];

        long lastLoc = 0;

        long lastProfit = 0;


        long[] max = new long[N+1];

        long[] distance = new long[N+1];

        long maxLoc = 0;

        long maxProfit = 0;

        for (int i = 0; i < N; i++) {

            x[i] = s.nextLong();

            v[i] = s.nextLong();

            lastProfit += v[i];

            long localProfit = lastProfit - x[i];

            if (maxProfit < localProfit) {

                maxProfit = localProfit;

                maxLoc = x[i];
            }

            max[i+1] = maxProfit;

            distance[i+1] = maxLoc;
        }


        long resultMax = max[N-1];

        long lastsum = 0;


        for (int b = N-1; b >=0; b--) {

            lastsum += v[b];



            long dist1 = C-x[b];
            long dist2 = distance[b];

            long localmax = lastsum - dist1;

            long fd = Math.min(dist1, dist2);

            long reverse = max[b];

            long localresult = localmax + reverse - fd;

            resultMax = Math.max(localresult, resultMax);



        }

        System.out.print(resultMax);
    }


}