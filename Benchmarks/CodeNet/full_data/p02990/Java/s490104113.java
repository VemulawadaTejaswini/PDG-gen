import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long k = sc.nextLong();
        long res;
        
        for(long i = 1;i<=k;i++){
            res = calc(n-k+1,i) * (long)Math.pow(i,k-i);
            System.out.println(res % 1000000007);
        }
    }
    
    
    private static long calc(long n, long r){
        long num = 1;
        for(long i = 1; i <= r; i++){
            num = (num * (n - i + 1) / i) % 1000000007;
        }
        return num;
    }
}


