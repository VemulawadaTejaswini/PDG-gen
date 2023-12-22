import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long _x = x;
        int res = 0;
        while(x >= 10){
            res += 9;
            x /= 10;
        }
        res += (x-1);
        StringBuffer t = new StringBuffer();
        t.append(x);
        for (int i = 0; i < res/9; i++) {
            t.append("9");
        }
        long s = Long.parseLong(t.toString());
        if(s == _x){
            res++;
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

