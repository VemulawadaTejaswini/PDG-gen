import java.util.*;

public class Main {

    public static int lowerBound(int[] array, int value) {
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

    public static int upperBound(int[] array, int value) {
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

    int count(int[] array, int lower, int upper) {
        int lowerIdx = lowerBound(array, lower);
        int upperIdx = upperBound(array, upper);
//        debug(lower, upper, lowerIdx, upperIdx);
        return upperIdx - lowerIdx;
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
//        debug(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int lower = arr[j] - arr[i];
                int upper = arr[j] + arr[i];
                count += count(arr, Math.max(arr[j], lower) + 1, upper - 1);
            }
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
