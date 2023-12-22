import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 5) {
            System.out.println(0);
        } else if (a >= 6 && a <= 12) {
            System.out.println(b/2);
        } else {
            System.out.println(b);
        }
    }

}
