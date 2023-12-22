import java.util.*;

public class Main {

    static long[] L = new long[90];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        L[0] = 2;
        L[1] = 1;
        System.out.println(lucas(n));
        sc.close();
    }

    public static long lucas(int n){
        if(L[n] != 0) return L[n];
        L[n] = lucas(n-1) + lucas(n-2);
        return L[n];
    }
}
 