import java.util.Scanner;

/**
 * Created by zzt on 17-2-18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        m /= 2;
        System.out.println(Math.min(n, m));
    }
}