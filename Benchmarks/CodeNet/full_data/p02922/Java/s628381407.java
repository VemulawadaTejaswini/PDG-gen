import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int tap = 1;
        int outlet = 1;

        if (num1 > num2) {
            tap = 0;
        } else {
            num2 -= num1;

            while (num2 > 0) {
                num2 -= num1 - 1;
                tap++;
            }
        }
        System.out.println(tap);
    }
}