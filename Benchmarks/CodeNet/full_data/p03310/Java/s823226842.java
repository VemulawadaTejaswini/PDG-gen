import java.util.Scanner;

public class Main {
    public static long getMaxDif(long[] s, int x, int y, int z) {
        long[] a = {0, 0, 0, 0};
        a[0] = s[x];
        a[1] = s[y] - s[x];
        a[2] = s[z] - s[y];
        a[3] = s[s.length - 1] - s[y];
        long max = 0;
        for (int i = 0; i < 4; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        long min = a[0];
        for (int i = 1; i < 4; ++i) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max - min;
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long[] array1 = new long[n];
        long[] array2 = new long[n];
        array1[0] = stdIn.nextLong();
        array2[0] = array1[0];
        for (int i = 1; i < n; ++i) {
            array1[i] = stdIn.nextLong();
            array2[i] = array2[i-1] += array[i];
        }
        long mindif = Long.MAX_VALUE;
        int[] num = new int[3];
        for (int i1 = 0; i1 < n - 3; ++i1) {
            for (int i2 = i1 + 1; i2 < n - 2; ++i2) {
                for (int i3 = i2 + 1; i3 < n - 1; ++i3) {
                    long current = getMaxDif(array2, i1, i2, i3);
                    if (current < mindif) {
                        mindif = current;
                    }
                }
            }
        }
        System.out.print(mindif);
    }
}