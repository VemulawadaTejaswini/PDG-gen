import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = 0;
        while(true) {
            if(n - (a + b) > 0) {
                n = n - (a + b);
                ans += a;
            } else {
                ans += Math.min(a, n);
                break;
            }
        }
        System.out.println(ans);
    }
}