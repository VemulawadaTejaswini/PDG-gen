import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 81 ) {
            for (int i = 9; i >= 1; i--) {
                if (n % i != 0) {
                    continue;
                }
                if (n / i < 10) {
                    System.out.println("Yes");
                    return;
                }
            }

        }
        System.out.println("No");
    }
}
