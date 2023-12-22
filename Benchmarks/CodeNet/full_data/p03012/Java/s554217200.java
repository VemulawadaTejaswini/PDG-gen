import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int[] ruiseki = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ruiseki[i] = 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            ruiseki[i] = ar[i-1]+ruiseki[i-1];
        }

        for (int i = 1; i <= n; i++) {
            res = Math.min(res, Math.abs(ruiseki[i] - (ruiseki[n] - ruiseki[i])));
        }
        System.out.println(res);

    }
}

class io{
    public static void br(){
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }

}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}

