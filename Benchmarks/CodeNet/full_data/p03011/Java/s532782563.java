import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        int result = 1000;
        result = Math.min(ab + bc, result);
        result = Math.min(ac + bc, result);
        result = Math.min(ab + ac, result);
        System.out.println(result);
    }
}