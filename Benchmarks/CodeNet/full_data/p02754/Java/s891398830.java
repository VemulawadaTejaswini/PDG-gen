import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        if (a == 0) {
            System.out.println(0);
            return;
        }
        long b = sc.nextLong();

        long count = n / (a + b);
        long ans = count * a;
        n -= count * (a + b);

        System.out.println(ans + n);
    }
}
