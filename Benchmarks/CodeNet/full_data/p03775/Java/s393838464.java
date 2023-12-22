import java.util.*;

class Main{
    static long digits(long n){
        long res = 0;
        while(n > 0){
            res++;
            n /= 10; 
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long f = 0;
        long ans = Long.MAX_VALUE;
        for(long i = 1; i*i <= N; i++){
            if(N % i == 0){
            f = Math.max(digits(i), digits(N / i));
            ans = Math.min(ans, f);
            }
        }
        System.out.println(ans);
    }
}