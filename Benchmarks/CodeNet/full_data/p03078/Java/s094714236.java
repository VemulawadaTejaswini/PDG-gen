import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static long[] aArr;
    static long[] bArr;
    static long[] cArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        aArr = new long[x];
        bArr = new long[y];
        cArr = new long[z];

        for (int i = 0; i < x; i++) {
            aArr[i] = sc.nextLong();
        }

        for (int i = 0; i < y; i++) {
            bArr[i] = sc.nextLong();
        }

        for (int i = 0; i < z; i++) {
            cArr[i] = sc.nextLong();
        }

        Long[] abSum = new Long[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                abSum[i * y + j] = aArr[i] + bArr[j];
            }
        }
        Arrays.sort(abSum, Comparator.reverseOrder());

//        System.out.println(abList);
        int m = Math.min(x * y, k);
        z = Math.min(z, k);
        Long[] sum = new Long[m * z];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < z; j++) {
                sum[i * z + j] = abSum[i] + cArr[j];
            }
        }

        Arrays.sort(sum, Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.println(sum[i]);
        }
    }

    static void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

}
