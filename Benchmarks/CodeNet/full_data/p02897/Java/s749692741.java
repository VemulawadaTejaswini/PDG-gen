import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n % 2 == 1) {
            System.out.printf("%.6f", (double) (n / 2 + 1) / n);
        } else {
            System.out.printf("%.6f", 0.5);
        }
    }
}
