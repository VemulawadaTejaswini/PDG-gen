import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long count = 0;
        long ansc = 0;
        long ansd = 0;
        long anscd = 0;
        long ans = 0;
        if (a % c != 0) {
            ansc = ((((b / c)) * c - ((a / c) + 1) * c) / c) - 1;
        } else {
            ansc = ((((b / c)) * c - ((a / c) * c)) / c) - 1;
        }
        if (a % d != 0) {
            ansd = ((((b / d)) * d - ((a / d) + 1) * d) / d) ;
        } else {
            ansd = ((((b / d)) * d - ((a / d) + 1) * d) / d) ;
        }
        long lcm = c * d / gcd(c, d);
        if (a % lcm !=0) {
            anscd = (((b / (lcm)) * (lcm)) - (((a / (lcm)) + 1) * (lcm))) / (lcm) - 1;
        }
        ans = b - a + 1 - ansc - ansd + anscd-1;
        System.out.println(ans);
//        for(long i= a; i<=b; i++){
//            if(i%c !=0 && i% d !=0){
//                count++;
//            }
//        }
    }

    private static long gcd(long m, long n) {
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m % n);
    }
}

