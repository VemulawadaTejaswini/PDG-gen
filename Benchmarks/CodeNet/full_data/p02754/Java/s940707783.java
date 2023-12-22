import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = a + b;

        long d = n / c;

        if (n % c > a) {
            System.out.println(d * a + a);
        } else {
            System.out.println(d * a + n % c);
        }


    }

}
