
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] B = new int[N];

        for (int i = 0 ; i < N - 1 ; i++) {
            B[i] = scanner.nextInt();
        }

        long answer = B[0];

        for (int i = 1 ; i < N ; i++) {
            answer += Math.min(B[i], B[i - 1]);
        }

        System.out.println(answer);
    }
}
