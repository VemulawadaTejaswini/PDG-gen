import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[][] lengths = new int[n * 2][n * 2];
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    lengths[i][j] = 1;
                    max = 1;
                }
            }
        }
        for (int i = 1; i < n / 2; i *= 2) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + i + 1; k < n; k++) {
                    if (lengths[j][k] != i) {
                        continue;
                    }
                    lengths[j][k] = Math.min(lengths[j][k] + lengths[j + i][k + i], k - j);
                    max = Math.max(max, lengths[j][k]);
                }
            }
        }
        System.out.println(max);
    }
}