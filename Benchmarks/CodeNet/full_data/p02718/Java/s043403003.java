import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1 / (4 * m)) {
                count++;
            }
        }
        System.out.println(count > 4 ? "Yes" : "No");

    }
}