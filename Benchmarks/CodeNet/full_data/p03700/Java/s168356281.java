import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        int lb = 0;
        int ub = (int) Math.pow(10, 9) + 1;
        while (ub - lb > 1) {
            int mid = (ub + lb) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                long rest = h[i] - (long) mid * B;
                if (rest > 0) {
                    if (rest % (A - B) == 0) {
                        sum += rest / (A - B);
                    } else {
                        sum += rest / (A - B) + 1;
                    }
                }
            }
            if (sum <= mid) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }
}
