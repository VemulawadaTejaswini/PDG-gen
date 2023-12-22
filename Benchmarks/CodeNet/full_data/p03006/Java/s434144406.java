import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int p = x[i] - x[j];
                    int q = y[i] - y[j];

                    int cost = n;
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            if (x[k] - x[l] == p && y[k] - y[l] == q) {
                                cost--;
                            }
                        }
                    }
                    min = Math.min(min, cost);
                }
            }
        }
        System.out.println(min);
    }
}