import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long x = n;
        if (n % k == 0) {
            x = 0;
        } else {
            while (Math.abs(x - k) < Math.abs(n - k) || x > k) {
                x = Math.abs(x - k);
            }
        }

        System.out.print(x);
    }
}
