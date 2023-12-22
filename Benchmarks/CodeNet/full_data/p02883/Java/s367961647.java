import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] aArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        Arrays.sort(aArr);

        Integer[] fArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            fArr[i] = sc.nextInt();
        }
        Arrays.sort(fArr, Comparator.reverseOrder());

        long left = 0;
        long right = 0;
        for (int i = 0; i < n; i++) {
            right = Math.max(right, (long) aArr[i] * fArr[i]);
        }

        debug(aArr, fArr);
        while (left != right) {
            debug(right, left);
            long j = (right + left) / 2;
            long result = 0;
            for (int i = 0; i < n; i++) {
                result += Math.max(0, aArr[i] - j / fArr[i]);
                if (result > k) break;
            }
            if (result <= k) {
                right = j;
            } else {
                left = j + 1;
            }
        }
        System.out.println(left);


    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
