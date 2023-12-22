import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] a;
    static long[] b;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        a = new int[n];
        b = new long[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i+1] = b[i] + a[i];
        }

        long ret = Long.MAX_VALUE;
        for (int i = 2; i < n - 1; i++) {
            ret = Math.min(s(i), ret);
        }
        System.out.println(ret);
    }

    static long s(int index) {
        int lft = bs(0, index);
        int rgt = bs(index, a.length);
        long[] ret = new long[4];
        ret[0] = b[lft];
        ret[1] = b[index] - b[lft];
        ret[2] = b[rgt] - b[index];
        ret[3] = b[a.length] - b[rgt];
        Arrays.sort(ret);
        return ret[3] - ret[0];
    }

    static int bs(int l, int h) {
        int lo = l;
        int hi =  h;
        while (hi - lo > 1){
            int mi = (hi + lo) / 2;
            if(mi == l) {
                return mi;
            }
            long tmp1 = Math.abs(b[hi] - 2 * b[mi] + b[l]);
            long tmp2 = Math.abs(b[hi] - 2 * b[mi-1] + b[l]);
            if (tmp1 < tmp2) {
                lo = mi;
            }
            else {
                hi = mi;
            }
        }
        return lo;
    }
}
