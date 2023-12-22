import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int k = sc.nextInt();
        final int x = sc.nextInt();

        System.out.println(500 * k >= x ? "Yes" : "No");
    }
}
