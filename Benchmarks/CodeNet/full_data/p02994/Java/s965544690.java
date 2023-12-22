import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int L = sc.nextInt();

        final int[] tastes = new int[N];
        for (int i = 0; i < N; i++) {
            tastes[i] = L + (i+1) - 1;
        }

        int x = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (min > Math.abs(tastes[i])) {
                x = i;
                min = Math.abs(tastes[i]);
            }
        }

        tastes[x] = 0;

        System.out.println(IntStream.of(tastes).sum());
    }
}
