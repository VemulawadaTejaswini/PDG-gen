import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long K = sc.nextLong(); 
        sc.nextLine();
        long sum = new Long(0);

        for(int i = 1; i <= K; i++){
            for(int j = i; j <= K; j++){
                for(int k = j; k <= K; k++) {
                    sum += gcdtrip(i, j, k)*check(i, j, k);
                }
            }
        }
        System.out.println(sum);
    }

     static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    static long gcdtrip(long a, long b, long c) {
        return gcd(a,gcd(b,c)) ;
    }

    static int check(int a, int b, int c) {
        if (a == b && a == c && b == a) {
            return 1;
        } else if (a == b || b == c || a == c) {
            return 3;
        } else {
            return 6;
        }
    }
}