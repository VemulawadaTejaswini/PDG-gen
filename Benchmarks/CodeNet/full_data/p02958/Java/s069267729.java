import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int cnt = 0;
        boolean f = true;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if((ar[i]- 1) != i){
                cnt++;
            }
        }
        if(cnt == 0 || cnt == 2){
            f = true;
        }else{
            f = false;
        }
        io.YESNO(f);
    }
}

class io{

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

