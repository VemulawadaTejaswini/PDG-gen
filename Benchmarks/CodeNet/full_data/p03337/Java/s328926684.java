import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        System.out.println(Math.max(Math.max(addition, subtraction), multiplication));
    }
}
