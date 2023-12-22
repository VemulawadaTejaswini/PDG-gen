

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static int n;
    static long[] a;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int lft = 0;
        int rgt = n;
        while (rgt - lft > 2) {
            int mi1 = (lft * 2 + rgt) / 3;
            int mi2 = (lft + rgt * 2) / 3;
            int ret1 = eval(mi1);
            int ret2 = eval(mi2);
            if (ret1 < ret2) {
                rgt = mi2;
            } else {
                lft = mi1;
            }
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = lft; i < lft + 3 & i < n; i++) {
            ret.add(eval(i));
        }
        System.out.println(ret.stream().mapToInt(Integer::intValue).min().getAsInt());
    }

    static int eval(int m) {
        int ret = m;
        if (m > 0) {
            long tmp = a[m - 1];
            int kata = 0;
            for (int i = m - 2; i >= 0; i--) {
                if (a[i] < tmp) {
                    int cnt = (int) (Math.ceil(Math.log(1.0 * tmp / a[i]) / Math.log(4)));
                    ret += 2 * cnt + kata;
                    tmp = a[i] * (int) Math.pow(4, cnt);
                    if (tmp > 1 << 30) {
                        long hoge = (long) (Math.log(tmp >> 30) / Math.log(2));
                        hoge -= hoge % 2;
                        kata += hoge;
                        tmp >>= hoge;
                    }
                } else {
                    tmp = a[i];
                }
            }
        }

        long tmp = a[m];
        int kata = 0;
        for (int i = m + 1; i < n; i++) {
            if (a[i] < tmp) {
                int cnt = (int) (Math.ceil(Math.log(1.0 * tmp / a[i]) / Math.log(4)));
                ret += 2 * cnt + kata;
                tmp = a[i - 1] * (int) Math.pow(4, cnt);
                if (tmp > 1 << 30) {
                    long hoge = (long) (Math.log(tmp >> 30) / Math.log(2));
                    hoge -= hoge % 2;
                    kata += hoge;
                    tmp >>= hoge;
                }
            } else {
                tmp = a[i];
            }
        }
        return ret;
    }
}