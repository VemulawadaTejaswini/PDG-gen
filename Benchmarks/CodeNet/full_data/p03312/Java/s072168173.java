import java.util.*;

import com.sun.jmx.mbeanserver.SunJmxMBeanServer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long[] sum = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i == 0) {
                sum[i] = a[i];
            } else {
                sum[i] = sum[i - 1] + a[i];
            }
        }

        int l, m, r;

        long min = Long.MAX_VALUE;
        int se = 100;
        int ml, mr, mm;
        mm = Arrays.binarySearch(sum, sum[n - 1] / 2);
        if(mm <= 0) mm = -mm - 1;
        ml = Arrays.binarySearch(sum, sum[mm - 1] / 2);
        if (ml <= 0)
            ml = -ml - 1;
        mr = Arrays.binarySearch(sum, (sum[n - 1] - sum[mm]) / 2 + sum[mm - 1]);
        if(mr <= 0) mr = -mr - 1;

        for (m = mm-se; m < mm + se; m++) {
            for (int i = ml - se; i <= ml + se; i++) {
                for (int j = mr - se; j <= mr + se; j++) {
                    if (i <= 1)
                        i = 1;
                    if (i >= m)
                        break;
                    if (j <= m)
                        continue;
                    if (j >= n)
                        break;
                    long[] p = new long[4];
                    p[0] = sum[i - 1];
                    p[1] = sum[m - 1] - sum[i - 1];
                    p[2] = sum[j - 1] - sum[m - 1];
                    p[3] = sum[n - 1] - sum[j - 1];
                    long mmax = Long.MIN_VALUE;
                    long mmin = Long.MAX_VALUE;
                    for (int k = 0; k < 4; k++) {
                        if (p[k] >= mmax)
                            mmax = p[k];
                        if (p[k] <= mmin)
                            mmin = p[k];
                    }
                    if (mmax - mmin <= min)
                        min = mmax - mmin;
                    // System.out.println(i + ", " + m + ", " + j + ", " + (mmax - mmin));
                }
            }
        }

        System.out.println(min);
    }
}