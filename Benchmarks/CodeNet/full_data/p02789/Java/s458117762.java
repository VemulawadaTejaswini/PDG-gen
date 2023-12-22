import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();

        int m = sc.nextInt();

        if (n == m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
