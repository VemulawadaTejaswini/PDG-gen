import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] T = new long[N];
        for(int i = 0; i < N; i++){
            T[i] = sc.nextLong();
        }
        sc.close();

        
        long[] a = new long[N];
        long[] b = new long[N];
        a[0] = T[0];
        b[0] = T[0];
        for(int i = 1; i < N; i++){
            a[i] = gcd(b[i-1], T[i]);
            b[i] = b[i-1]*(T[i]/a[i]);
        }
        System.out.println(b[N-1]);
    }
    static long gcd(long n, long m){
        if(m > n)
            return gcd(m, n);
        else {
            if(m == 0)
                return n;
            else
                return gcd(m, n%m);
        }
    }
}