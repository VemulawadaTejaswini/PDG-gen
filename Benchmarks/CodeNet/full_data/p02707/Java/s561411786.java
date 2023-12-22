import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[] boss = new int[n];
        Arrays.fill(boss, 0);
        for (int i = 1; i < n; i++) {
            boss[a[i] - 1]++;
        }

        for (int i = 0; i < boss.length; i++) {
            System.out.println(boss[i]);
        }
    }
}
