import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2 % num1 == 0) {
            //割り切れるとき
            System.out.println(num2 / num1);
        } else {
            //割り切れないとき
            System.out.println(num2 / num1 + 1);
        }
    }
}