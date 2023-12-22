
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        int max = 0;
        int second = 0;

        for (int i = 0 ; i < N ; i++) {
            A[i] = scanner.nextInt();

            if (A[i] >= max) {
                second = max;
                max = A[i];
            } else if (A[i] >= second) {
                second = A[i];
            }
        }

        for (int i = 0 ; i < N ; i++) {
            if (A[i] == max) {
                System.out.println(second);
            } else {
                System.out.println(max);
            }
        }
    }
}
