import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a + b;
        int multiple = a * b;
        int minus = b > 0 ? a - b : Math.abs(b - a);

        int ans = Math.max(minus, Math.max(plus, multiple));
        System.out.println(ans);
    }
}

