import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long k = scanner.nextInt();
        long ans = 0;
        for(long i = k; i <= n+1; i++){
            long l = sum(0, i-1);
            long r = sum(n-i+1, n);
            ans += r-l+1;
        }
        System.out.println((int) (ans % (Math.pow(10, 9) + 7)));
    }

    public static long sum(long l, long r){
        return (l+r) * (r - l + 1) / 2;
    }
}