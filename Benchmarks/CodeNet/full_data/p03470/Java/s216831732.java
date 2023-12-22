import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] d = new int[N];
            for (int i = 0; i < N; i++) {
                d[i] = in.nextInt();
            }

            Arrays.sort(d);

            int count = 1;
            for (int i = 1; i < N; i++) {
                if (d[i - 1] < d[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
