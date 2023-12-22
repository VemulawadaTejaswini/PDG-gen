import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= b && a >= c) {
            System.out.println(10*a + b + c);
        } else if (b > a && b >= c) {
            System.out.println(10*b + c + a);
        } else {
            System.out.println(10*c + a + b);
        }
    }
}
