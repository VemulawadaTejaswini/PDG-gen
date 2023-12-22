import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        while (n > 0) {
            if (n % 4 == 0 || n % 7 == 0 || n % 11 == 0) {
                System.out.println("Yes");
                return;
            }
            n -= 4;
        }
        while (n > 0) {
            if (n % 4 == 0 || n % 7 == 0 || n % 11 == 0) {
                System.out.println("Yes");
                return;
            }
            n -= 7;
        }

        System.out.println("No");
    }
}