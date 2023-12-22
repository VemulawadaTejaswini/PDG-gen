import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = (long) x / 11;
        long z = x % 11;
        if (z == 0) {
            System.out.println(2 * y);
        } else if (z <= 5) {
            System.out.println(2 * y + 1);
        } else {
            System.out.println(2 * y + 2);
        }
    }

}