import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        long a = 0;
        for(long i = 1; i < 1000000000; i++){
            if(i * i >= n){
                a = i;
                break;
            }
        }
        long b = 0;
        long c = 0;
        int d = 0;
        boolean ans = true;
        if(isPrime(n))  ans = false;
        else    d = 1;
        while(d == 1){
            loop:for(long i = a; i < 1000000000; i++){
                for(long j = i; j > 0; j--){
                    if(i * j == n){
                        b = i - 1;
                        c = j - 1;
                        d = 0;
                        break loop;
                    }
                    if(i * j < n)   break;
                }
            }
        }
        if(ans) System.out.println(b + c);
        else    System.out.println(n - 1);
    }
    static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(long i = 3; i * i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}