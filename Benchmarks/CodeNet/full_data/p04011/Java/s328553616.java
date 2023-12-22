import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (n > k) {
            System.out.println(k * x + (n - k) * y);
        } else {
            System.out.println(n * x);
        }

    }
}