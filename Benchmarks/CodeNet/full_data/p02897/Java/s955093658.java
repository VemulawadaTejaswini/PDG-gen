import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ki = (N / 2) + (N % 2);

        System.out.println((double)ki / (double)N);
    }
}
