import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        while (true) {
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    ok = false;
                    break;
                }
                arr[i] = arr[i] / 2;
            }
            if (!ok) break;
            count++;
        }

        System.out.println(count);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
