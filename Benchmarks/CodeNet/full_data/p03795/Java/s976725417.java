import java.util.Scanner;

/**
 * Created by User on 2017/02/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int x = n * 800;
        int y = 200 * (n / 15);

        System.out.println(x - y);
    }
}