
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long d = (long) 4 * a * b;
        long e = (long) (c - a - b) * (c - a - b);

        if (4 * Math.sqrt(a * b) < c - a - b ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
