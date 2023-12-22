
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long l = -1000000000000000001L;
        long r = 1000000000000000001L;

        while (r - l > 1) {
            long mid = (l + r) / 2;
            if (ok(a, n, k, mid)) {
                r = mid;
            } else {
                l = mid;
            }
        }

        System.out.println(r);
    }

    static boolean ok(long[] a, int n, long k, long b) {
        long num = 0;
        for (int i=0; i<n; i++) {
            int c = 0;
            if(a[i] >= 0) {
                if(a[i] * a[0] > b) {
                    c = 0;
                } else if( a[i] * a[n-1] <=b ) {
                    c = n;
                } else {
                    int l = 0;
                    int r = n - 1;
                    while (r - l > 1) {
                        int mid = (r + l) / 2;
                        if (a[i] * a[mid] <= b) {
                            l = mid;
                        } else {
                            r = mid;
                        }
                    }
                    c = l + 1;
                }
                num += Math.max(0, c - (i+1));
            } else {
                if(a[i] * a[n-1] > b) {
                    c = 0;
                } else if ( a[i] * a[0] <= b) {
                    num += n - 1 - i;
                } else {
                    int l = 0;
                    int r = n - 1;
                    while (r - l > 1) {
                        int mid = (r+l)/ 2;
                        if(a[i] * a[mid] <= b) {
                            r = mid;
                        } else {
                            l = mid;
                        }
                    }
                    num += Math.min(n - r, n - 1 - i);
                }
            }
        }
        return num >= k;
    }

}
