import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int nibutan = Algo.nibutan(l[i] + l[j], l);
                // l[i]+l[j]>=l[nibutan]なる最小のindex
                res += (nibutan - j - 1);
            }
        }

        System.out.println(res);
        sc.close();
    }
}

class io {
    public static void br() {
        System.out.println("");
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
                // too low
                low = res + 1;
            } else {
                // 上界
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

