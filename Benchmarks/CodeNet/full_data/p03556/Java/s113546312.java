import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            if ((int) Math.sqrt(N - i) * (int) Math.sqrt(N - i) == N - i) {
                System.out.println(N - i);
                break;
            }
        }
    }
}