
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 10];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int[] ans = new int[n + 10];
        Arrays.fill(ans, 1 << 30);
        ans[0] = ar[0];
        int color = 0;
        int len = 0;
        for (int i = 1; i < n; i++) {
            if (ans[len] < ar[i]) {
                ans[len + 1] = ar[i];
                len++;
            } else {
                int idx = upperBound(ans, ar[i]);
                debug(i, idx);
                ans[idx] = ar[i];
                color++;
            }
        }
        debug(ans);
        System.out.println(color);
    }

    public int lowerBound(int[] array, int value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] >= value) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }

    public int upperBound(int[] array, int value) {
        int left = -1;
        int right = array.length;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array[middle] > value) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }


    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
