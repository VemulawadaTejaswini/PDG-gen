import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] color = new int[8];
        int legend = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
            int index = color(a[i]);
            if (index != -1) {
                color[index] += 1;
            } else {
                legend += 1;
            }
        }
        int minimum = 0;
        for (int i = 0; i < 8; i++) {
            if (0 < color[i]) {
                minimum += 1;
            }
        }
        System.out.println(minimum + " " + Math.min(minimum + legend, 8));
    }
    private static int color(int score) {
        if (score < 400) {
            return 0;
        }
        if (score < 800) {
            return 1;
        }
        if (score < 1200) {
            return 2;
        }
        if (score < 1600) {
            return 3;
        }
        if (score < 2000) {
            return 4;
        }
        if (score < 2400) {
            return 5;
        }
        if (score < 2800) {
            return 6;
        }
        if (score < 3200) {
            return 7;
        }
        return -1;
    }
}
