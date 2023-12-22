import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a);
        int cnt = 0;

        List<Integer> list = new ArrayList<Integer>();
        int target = a[0];
        for (int i = 2; i <= a[0];) {
            if (target % i == 0) { // 最小の因数を求める
                list.add(i);
                target /= i; // 最小の因数で割った数を代入する
            } else
                i++;
        }

        int ans = 1;
        for (int j = 0; j < list.size(); j++) {
            cnt = 0;
            int tmp = list.get(j);
            for (int i = 0; i < n; i++) {
                if (a[i] % tmp != 0) {
                    cnt++;
                } else {
                    a[i] /= tmp;
                }
                if (cnt > 1) {
                    break;
                }
                if (i == n - 1) {
                    ans *= tmp;
                    // System.out.println(tmp);
                }
            }
        }
        List<Integer> list2 = new ArrayList<Integer>();
        Arrays.sort(b);
        target = b[1];
        for (int i = 2; i <= b[1];) {
            if (target % i == 0) { // 最小の因数を求める
                list2.add(i);
                target /= i; // 最小の因数で割った数を代入する
            } else
                i++;
        }
        /*
         * for (int var : list2) { System.out.println(var); }
         */

        int ans2 = 1;
        for (int j = 0; j < list2.size(); j++) {
            cnt = 0;
            int tmp = list2.get(j);
            for (int i = 0; i < n; i++) {
                if (b[i] % tmp != 0) {
                    cnt++;
                } else {
                    b[i] /= tmp;
                }
                if (cnt > 1) {
                    break;
                }
                if (i == n - 1) {
                    ans2 *= tmp;
                    // System.out.println(tmp);
                }
            }
        }
        if (ans2 > ans) {
            ans = ans2;
        }

        System.out.println(ans);

        sc.close();
    }
}