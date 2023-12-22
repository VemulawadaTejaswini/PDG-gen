import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (c - a - b - 2 * Math.sqrt(a) * Math.sqrt(b) > 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
