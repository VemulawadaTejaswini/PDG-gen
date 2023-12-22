import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a - b) > 1) {
            int c = Math.max(a, b);
            System.out.println(2 * c  - 1);
        } else {
            System.out.println(a + b);
        }

    }

}
