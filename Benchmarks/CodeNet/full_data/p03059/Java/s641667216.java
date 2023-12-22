import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int t = sc.nextInt();

        System.out.println((int)Math.floor((t+0.5) / a) * b);
    }
}
