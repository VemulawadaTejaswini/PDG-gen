
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int c = A * B;
        int d =  Math.max(A-B, A + B);


        System.out.println(Math.max(c, d));
    }
}