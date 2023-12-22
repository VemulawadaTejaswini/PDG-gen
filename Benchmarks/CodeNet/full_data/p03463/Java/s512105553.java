import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (Math.abs(B - A - 1) % 2 != 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}