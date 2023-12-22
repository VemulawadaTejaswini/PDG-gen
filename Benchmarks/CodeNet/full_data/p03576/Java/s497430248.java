import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        int contain = 0;
                        for (int m = 0; m < N; m++) {
                            if (x[i] <= x[m] && x[j] >= x[m] && y[k] <= y[m] && y[l] >= y[m]) {
                                contain++;
                            }
                            if (contain >= K) {
                                min = Math.min(min, (long)(x[j] - x[i]) * (y[l] - y[k]));
                            }
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }
}
