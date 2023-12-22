
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (a + b == c + d) {
            System.out.println("Balanced");
            return;
        }
        if (a + b > c + d) {
            System.out.println("Left");
        } else {
            System.out.println("Right");
        }
    }
}
