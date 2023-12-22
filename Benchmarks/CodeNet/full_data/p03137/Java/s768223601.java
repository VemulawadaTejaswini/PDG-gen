import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];

        if (m == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int[] kyori = new int[m - 1];
        int kIndex = 0;
        for (int i = 1; i < m; i++) {
            kyori[kIndex] = Math.abs(x[i - 1] - x[i]);
            kIndex++;
        }

        int sum = Arrays.stream(kyori).sum();

        Arrays.sort(kyori);

        for (int i = kyori.length - 1; kyori.length - n < i; i--) {
            sum -= kyori[i];
        }

        System.out.println(sum);
    }
}