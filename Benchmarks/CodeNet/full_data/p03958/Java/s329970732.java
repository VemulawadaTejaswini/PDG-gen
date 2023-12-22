import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[T];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        int[] r = new int[K];
        int sameCount = 0;
        for (int i = 0; i < K; ++i) {
            int maxIdx = maxIdx(a);
            int nextMaxIdx = nextMaxIdx(a);
            if (i > 0 && r[i - 1] == maxIdx) {
                if (nextMaxIdx >= 0 && a[nextMaxIdx] > 0) {
                    a[nextMaxIdx]--;
                    r[i] = nextMaxIdx;
                    if (maxIdx == nextMaxIdx) {
                        sameCount++;
                    }
                } else {
                    a[maxIdx]--;
                    r[i] = maxIdx;
                    sameCount++;
                }
            } else {
                a[maxIdx]--;
                r[i] = maxIdx;
            }
        }
        System.out.println(sameCount);
    }
    private static int maxIdx(int[] a) {
        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    private static int nextMaxIdx(int[] a) {
        int maxIdx = maxIdx(a);
        int nextMax = -1;
        int nextMaxIdx = -1;
        int zeroIdx = -1;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > 0 && i != maxIdx && a[i] > nextMax) {
                nextMax = a[i];
                nextMaxIdx = i;
            }
            if (a[i] == 0) {
                zeroIdx = i;
            }
        }
        if (nextMaxIdx == -1) {
            return zeroIdx;
        } else {
            return nextMaxIdx;
        }
    }
}