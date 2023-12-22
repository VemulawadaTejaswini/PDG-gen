import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n / 4; i++) {
            if ((n - 4 * i) % 7 == 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}
