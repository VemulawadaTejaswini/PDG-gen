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
        Arrays.sort(arr);

        boolean works = true;
        for (int i = n - 1; i > (n-1)-m; i--) {
            if (arr[i] < 1.0 * sum / 4 / m) {
                works = false;
            }
        }
        System.out.println(works ? "Yes" : "No");

    }
}