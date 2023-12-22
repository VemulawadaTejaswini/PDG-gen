import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = kbd.nextInt();
        }
        int min = 10000000;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            int d = diff(weights, i, n);
            if (min > d) {
                min = d;
                temp = i + 1;
            }
        }
        System.out.println(min);
    }

    static int diff(int[] weights, int ind, int n) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < ind; i++) {
            s1 += weights[i];
        }
        for (int j = n - 1; j >= ind; j--) {
            s2 += weights[j];
        }
        return Math.abs(s1 - s2);
    }
}