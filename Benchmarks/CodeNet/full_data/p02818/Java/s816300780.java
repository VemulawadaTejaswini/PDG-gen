import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (a >= k) {
            a = a - k;
        } else {
            b = b - (k - a);
            a = 0;
        }

        if (b < 0) {
            b = 0;
        }

        // 出力
        System.out.println(a + " " + b);
    }
}