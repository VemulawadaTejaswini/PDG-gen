import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (a + b <= k) {
            System.out.println("0 0");
            return;
        }
        if (a > k) {
            System.out.println(String.format("%s %s", a-k, b));
            return;
        }
        
        b = b- (k - a);
        a = 0;
        System.out.println(String.format("%s %s", a, b));

    }
}
