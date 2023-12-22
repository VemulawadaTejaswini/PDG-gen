import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int d = x % 10;
        x /= 10;
        int c = x % 10;
        x /= 10;
        int b = x % 10;
        x /= 10;
        int a = x % 10;

        int y;
        while (true) {
            y = a + b + c + d;
            if (y == 7) {
                System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
                break;
            }
            y = a + b + c - d;
            if (y == 7) {
                System.out.println(a + "+" + b + "+" + c + "-" + d+ "=7");
                break;
            }
            y = a + b - c + d;
            if (y == 7) {
                System.out.println(a + "+" + b + "-" + c + "+" + d+ "=7");
                break;
            }
            y = a + b - c - d;
            if (y == 7) {
                System.out.println(a + "+" + b + "-" + c + "-" + d+ "=7");
                break;
            }
            y = a - b + c + d;
            if (y == 7) {
                System.out.println(a + "-" + b + "+" + c + "+" + d+ "=7");
                break;
            }
            y = a - b + c - d;
            if (y == 7) {
                System.out.println(a + "-" + b + "+" + c + "-" + d+ "=7");
                break;
            }
            y = a - b - c + d;
            if (y == 7) {
                System.out.println(a + "-" + b + "-" + c + "+" + d+ "=7");
                break;
            }
            y = a - b - +c - d;
            if (y == 7) {
                System.out.println(a + "-" + b + "-" + c + "-" + d+ "=7");
                break;
            }
        }
    }
}
