import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] as = new int[n];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();

            if (as[i] > as[maxIndex]) {
                maxIndex = i;
            }

            if (as[i] < as[minIndex]) {
                minIndex = i;
            }
        }

        Arrays.sort(as);
        for (int i = 0; i < n; i++) {
            if (i == maxIndex) {
                System.out.println(2 * Math.abs(Math.max(0, as[as.length - 2]) - Math.min(0, as[0])));
            } else if (i == minIndex) {
                System.out.println(2 * Math.abs(Math.max(0, as[as.length - 1]) - Math.min(0, as[1])));
            } else {
                System.out.println(2 * Math.abs(Math.max(0, as[as.length - 1]) - Math.min(0, as[0])));
            }
        }
    }
}
