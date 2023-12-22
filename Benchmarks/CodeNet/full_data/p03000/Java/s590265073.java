import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int x = scanner.nextInt();
        scanner.nextLine();
        final int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final int[] hops = new int[n + 1];
        hops[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            hops[i] = hops[i - 1] + l[i - 1];
        }

        int count = 0;
        for (int i = 0; i < n + 1; i++) {
            if (x < hops[i]) break;

            count++;
        }

        System.out.println(count);
    }
}