import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final int[] time = new int[5];
        for (int i = 0; i < 5; i++) {
            time[i] = scanner.nextInt();
        }

        final int rem = Arrays.stream(time).map(t -> (t + 9) % 10).min().getAsInt() + 1;

        System.out.println(Arrays.stream(time).map(t -> (t + 9) / 10 * 10).sum() + rem - 10);
    }
}
