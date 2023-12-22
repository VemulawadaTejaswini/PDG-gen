import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] skewers = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            skewers[i] = sc.nextInt();
        }
        Arrays.sort(skewers);

        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += skewers[j * 2];
        }
        System.out.println(sum);

    }
}
