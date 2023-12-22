import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 入力受付
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i < 9; i++) {
            for (int j = 1; i < 9; j++) {
                if (i * j == n) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");

    }

}