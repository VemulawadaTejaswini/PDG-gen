import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (n > k) {
            long mod = n % k;
            long modb = Math.abs(mod - k);
            System.out.println(Math.min(modb, mod));
        } else if(n < k){
            System.out.println(Math.min(k - n, n));
        } else {
            System.out.println(0);
        }
    }
}
