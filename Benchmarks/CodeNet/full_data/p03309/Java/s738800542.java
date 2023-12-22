
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = Integer.parseInt(in.nextLine());
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.nextLine();
        int lo = 0;
        int hi = (int) 1e9;
        while (lo < hi) {
            int mid = lo + hi >>> 1;
            if (f(arr, mid) > f(arr, mid + 1)) {
                lo = mid - 1;
            } else {
                hi = mid;
            }
        }
        System.out.println(f(arr, lo));
    }

    private static int f(int[] arr, int b) {
        int res = 0;
        for (int value : arr) {
            res += Math.abs(value - ++b);
        }
        return res;
    }
}
