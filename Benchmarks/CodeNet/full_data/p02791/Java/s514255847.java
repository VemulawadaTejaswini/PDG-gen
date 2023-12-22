import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrays = new int[N];

        for (int i = 0; i < N; i++) {
            arrays[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            int[] subarray = Arrays.copyOfRange(arrays, 0, i);
            if (subarray.length == 0) {
                result++;
                continue;
            }

            int min = Arrays.stream(subarray).min().getAsInt();
            if (min >= arrays[i]) {
                result++;
            }
        }

        System.out.println(result);
    }

    static int min(int[] a) {
        Integer min = null;
        for (int i=0; i < a.length; i++) {
            if (min == null) {
                min = a[i];
                continue;
            }

            if (min > a[i]) {
                min = a[i];
                continue;
            }
        }

        return min;
    }
}
