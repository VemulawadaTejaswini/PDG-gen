import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = 11;
        for (int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if ((long) n % i == 0) {
                long b = (long) n / i;
                int c = 0;
                while (b > 0) {
                    b /= 10;
                    c++;
                }
                ans = Math.min(ans, c);
            }

        }
        System.out.println(ans);
    }

}