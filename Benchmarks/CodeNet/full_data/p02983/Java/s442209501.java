import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int l = in[0];
            int r = in[1];
            int mod = 2019;

            if (r - l > mod) System.out.println(0);
            int[] x = new int[mod];
            int length = 0;

            for (int i = l; i < r; i++) {
                x[length++] = i % mod;
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++){
                    int m = (x[i] * x[j]) % mod;

                    if (m < min) min = m;
                    if (min == 0) break;
                }
            }

            System.out.println(min);
        }

    }
}
