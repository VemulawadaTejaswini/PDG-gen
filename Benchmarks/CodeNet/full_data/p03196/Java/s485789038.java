import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = 0L;
        for(long i = 1;; i++) {
            long a = pow(i,n);
            if(a <= p) {
                if(p % a ==0) {
                    ans = i;
                }
            } else {
                System.out.println(ans);
                return;
            }
        }
    }

    public static long pow(long base, long n) {
        long retV = 1L;
        for (int i = 0; i < n; i++) {
            retV *= base;
        }
        return retV;
    }
}
