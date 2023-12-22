import java.util.Scanner;

/**
 * Created by zzt on 17-3-26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((a+b)%24);
    }
}