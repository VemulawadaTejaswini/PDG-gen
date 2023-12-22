import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        int[] cArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);
        Arrays.sort(cArr);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            int target = bArr[i];
            long aCount = BinarySearch.lowerBound(aArr, target);
            long cCount = n - BinarySearch.upperBound(cArr, target);
            ans += aCount * cCount;
        }

        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Template().run();
    }
}
