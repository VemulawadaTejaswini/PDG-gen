
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();

        final int h = sc.nextInt();
        final int w = sc.nextInt();

        System.out.println((H - h)*(W - w));
        System.out.flush();
        sc.close();
    }
}
