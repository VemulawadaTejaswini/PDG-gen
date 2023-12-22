import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int M = in.nextInt();

        int total = N * M;
        for (int i = 0; i < N - 1; i++) {
            int temp = in.nextInt();
            total -= temp;
        }

        if (total <= K && total > 0) {
            System.out.println(total);
        }
        else if (total < K) {
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }
}
