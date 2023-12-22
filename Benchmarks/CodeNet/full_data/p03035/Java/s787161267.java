import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = b;

        if (a <= 5) {
            res = 0;
        } else if (a <= 12) {
            res /= 2;
        }
        System.out.println(res);
    }
}