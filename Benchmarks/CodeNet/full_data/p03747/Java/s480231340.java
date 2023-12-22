import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int TIME = sc.nextInt();
        double[] xs = new double[N];
        int[] ds = new int[N];
        int[] ns = new int[N];

        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
            ds[i] = sc.nextInt();
            ns[i] = i;
        }

        for (int i = 0; i < TIME; i++) {
            for (int j = 0; j < N; j++) {
                if (ds[j] == 1) {
                    xs[j] = (xs[j] + 1) % L;
                } else {
                    double tmp = xs[j] - 1;
                    if (tmp >= 0) {
                        xs[j] = tmp;
                    } else {
                        xs[j] = tmp + L;
                    }
                }

                for (int k = 0; k < N; k++) {
                    if (xs[j] == xs[k]) {
                        int tmp = ns[j];
                        ns[j] = ns[k];
                        ns[k] = tmp;
                    }
                }
            }
        }

        int i = 0;
        int j = 0;
        while(i < N) {
            if (ns[j] == i) {
                System.out.println((int) xs[j]);
                i++;
                j = 0;
            } else {
                j++;
            }

            if (j >= N) {
                throw new RuntimeException("OVER");
            }
        }
    }
}
