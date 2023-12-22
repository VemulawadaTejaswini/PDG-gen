import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        long lcm = arr[0];
        for (int i=1; i<n; i++){
            lcm = lcm(lcm, arr[i]);
        }

        if (lcm>m) {
            System.out.println(0);
            return;
        }else {
            System.out.println(m/lcm+1);
        }



    }

    public static long lcm(long m, long n){
        return m*n/gcd(m ,n);
    }
    public static long gcd(long m, long n){
        if (m<n) gcd(n,m);
        if (n==0) return m;
        return gcd(n, m%n);
    }
}