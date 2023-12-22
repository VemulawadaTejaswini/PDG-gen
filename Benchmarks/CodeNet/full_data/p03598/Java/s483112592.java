import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            res += Math.min(b[i], k-b[i])*2;
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
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


}

