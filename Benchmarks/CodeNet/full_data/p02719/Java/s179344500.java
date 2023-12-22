import java.util.*;
class Main {
    public static int gcd(long n, int k) {
        if(n == 0) {
            return k;
        }
        if(k == 0) {
            return (int)n;
        }
        if(n > k) {
            return gcd((long)n-k, k);
        }
        else {
            return gcd(n, (int)k-n);
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();

        if(n % k == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(gcd(n, k));
        }
    }
}