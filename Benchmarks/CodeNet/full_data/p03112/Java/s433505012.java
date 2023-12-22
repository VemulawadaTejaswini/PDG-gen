import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int s;
    static int t;
    static int q;
    static long[] shrines;
    static long[] temples;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        t = sc.nextInt();
        q = sc.nextInt();

        shrines = new long[s];
        temples = new long[t];

        for (int i = 0; i < s; i++) {
            shrines[i] = sc.nextLong();
        }

        for (int i = 0; i < t; i++) {
            temples[i] = sc.nextLong();
        }

        for (int i = 0; i < q; i++) {
            long query = sc.nextLong();

            int shrineIdx = Arrays.binarySearch(shrines, query);
            int templeIdx = Arrays.binarySearch(temples, query);

            if (shrineIdx < 0) {
                shrineIdx = -shrineIdx - 1;
            }
            if (templeIdx < 0) {
                templeIdx = -templeIdx - 1;
            }
            long ans = getClosest(query, shrineIdx, templeIdx);
            System.out.println(ans);
        }
    }

    private static long getClosest(long query, int shrineIdx, int templeIdx) {
        long min = Long.MAX_VALUE;
        for (int i = shrineIdx-1; i <= shrineIdx; i++) {        // shrines
            for (int j = templeIdx-1; j <= templeIdx; j++) {      // temples
                if (i >= 0 && i < s && j >= 0 && j < t) {
                    long diff1 = Math.abs(query - shrines[i]);
                    long diff2 = Math.abs(query - temples[j]);
                    long diff3 = Math.abs(shrines[i] - temples[j]);
                    min = Math.min(min, diff1 < diff2 ? diff1 + diff3 : diff2 + diff3);
                }
            }
        }
        return min;
    }
}
