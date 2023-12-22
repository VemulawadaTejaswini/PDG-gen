import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long num = 1;

        if (a+2 >= b) {
            num += k;
        } else {
            if (k >= a+1) {
                num = b;
                k -= a+1;
                num += k / 2 * (b - a);
                num += k % 2;
            } else {
                num += k;
            }
        }

        System.out.println(num);
    }
}
