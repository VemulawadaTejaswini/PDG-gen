
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();

        int sum = 0;
        if (P >= Q && P >= R) {
            sum = Q + R;
        }
        if (Q >= P && Q >= R) {
            sum = R + P;
        }
        if (R >= Q && R >= P) {
            sum = Q + P;
        }
        System.out.println(sum);
    }

}