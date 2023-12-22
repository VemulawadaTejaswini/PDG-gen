import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int q_2 = q*8;
        int h_2 = h*4;
        int s_2 = s*2;
        int d_2 = d*1;
        int res_2 = Math.min(q_2,Math.min(h_2,Math.min(s_2,d_2)));
        int res_1 = Math.min(q_2/2, Math.min(h_2/2,s_2/2));
        long res = (long)res_2*(n/2) + (long)res_1*(n%2);
        System.out.println(res);

        sc.close();
    }
}

class io {
    public static void br() {
        System.out.println("");
    }

    public static void yesno(boolean f) {
        System.out.println(f ? "yes" : "no");
    }

    public static void YesNo(boolean f) {
        System.out.println(f ? "Yes" : "No");
    }

    public static void YESNO(boolean f) {
        System.out.println(f ? "YES" : "NO");
    }

}

class Algo {
    public static int nibutan(int target, int[] ar) {
        // ar[i] >= target なる最小のiを探す
        int res;
        int high = ar.length;
        int low = 0;
        while (high > low) {
            res = (high + low) / 2;
            if (ar[res] < target) {
                // ↑↓ここを変える
                low = res + 1;
            } else {
                // ↓ここを変える
                high = res;
            }
        }
        return low;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


}

