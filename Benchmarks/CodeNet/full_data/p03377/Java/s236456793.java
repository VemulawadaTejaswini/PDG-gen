
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        if (a + b >= x && a <= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
