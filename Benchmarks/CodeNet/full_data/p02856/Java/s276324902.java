import java.util.Scanner;

class D {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int M = sc.nextInt();
        long sum = 0;
        long ans = 0;
        for (int i = 0; i < M; i++) {
            final int d = sc.nextInt();
            final long c = sc.nextLong();
            sum += d * c;
            ans += c;
        }
        while(sum > 9) {
            ans += sum / 10;
            sum = sum % 10 + sum / 10;
        }
        System.out.println(ans - 1);
    }
}
public class Main {
    public static void main(String... args) {
        D.main();
    }
}
