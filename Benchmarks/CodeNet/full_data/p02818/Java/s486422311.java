import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        b += a;
        a -= k;
        b -= k;

        System.out.println(Math.max(a, 0) + " " + Math.max(b, 0));
    }
}
