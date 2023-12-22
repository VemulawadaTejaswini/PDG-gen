import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] d = new int[N];
            for (int i = 0; i < N; i++) {
                d[i] = in.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    sum += d[i] * d[j];
                }
            }

            System.out.println(sum);
        }
    }
}
