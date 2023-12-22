import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }

        long[] s_1 = new long[n];
        long[] s_2 = new long[n];
        long[] s_3 = new long[n];
        long[] s_4= new long[n];
        long[] s_5 = new long[n];
        long[] s_6 = new long[n];
        long[] s_7 = new long[n];
        long[] s_8 = new long[n];

        for (int i = 0 ; i < n ; i++) {
            s_1[i] = x[i] + y[i] + z[i];
            s_2[i] = x[i] + y[i] - z[i];
            s_3[i] = x[i] - y[i] + z[i];
            s_4[i] = x[i] - y[i] - z[i];
            s_5[i] = -x[i] + y[i] + z[i];
            s_6[i] = -x[i] + y[i] - z[i];
            s_7[i] = -x[i] - y[i] + z[i];
            s_8[i] = -x[i] + y[i] - z[i];
        }
        Arrays.sort(s_1);
        Arrays.sort(s_2);
        Arrays.sort(s_3);
        Arrays.sort(s_4);
        Arrays.sort(s_5);
        Arrays.sort(s_6);
        Arrays.sort(s_7);
        Arrays.sort(s_8);
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        long t4 = 0;
        long t5 = 0;
        long t6 = 0;
        long t7 = 0;
        long t8 = 0;

        for (int i = 0 ; i < m ; i++) {
            t1 += s_1[n - 1 - i];
            t2 += s_2[n - 1 - i];
            t3 += s_3[n - 1 - i];
            t4 += s_4[n - 1 - i];
            t5 += s_5[n - 1 - i];
            t6 += s_6[n - 1 - i];
            t7 += s_7[n - 1 - i];
            t8 += s_8[n - 1 - i];

        }
        long ans = Math.max(t1, t2);
        ans = Math.max(ans, t3);
        ans = Math.max(ans, t4);
        ans = Math.max(ans, t5);
        ans = Math.max(ans, t6);
        ans = Math.max(ans, t7);
        ans = Math.max(ans, t8);
        System.out.println(ans);
    }

}
