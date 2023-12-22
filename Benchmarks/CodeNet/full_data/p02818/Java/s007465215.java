import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        for (long i = 0; i < K; i++) {
            if (A >= 1) {
                A--;
            } else if (B >= 1) {
                B--;
            } else {
                break;
            }
        }
        System.out.println(A + " " + B);
    }
}
