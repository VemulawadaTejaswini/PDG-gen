import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();


        if (22 <= a + b + c) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }

    }
}
