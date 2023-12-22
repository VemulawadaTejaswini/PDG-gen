import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long res = 0;
        int n = sc.nextInt();
        int[] ar = new int[n*3];
        for (int i = 0; i < n * 3; i++) {
            ar[i] = sc.nextInt();
        }
      	Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            res += ar[ar.length - 1 - i * 2];
        }
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

