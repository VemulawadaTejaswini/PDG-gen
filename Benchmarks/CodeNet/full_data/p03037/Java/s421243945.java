import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int[] id = new int[n];
        Arrays.fill(id, 1);
        int count = 0;

        for (int i = 0; i < m; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
            for (int k = 0; k < l[i]-1; k++) {
                id[k] = 0;
            }
            for (int k = r[i] -1; k < n-1; k++) {
                id[k] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            if (id[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}