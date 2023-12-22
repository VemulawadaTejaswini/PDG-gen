import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt() - 1;
        }
        int sum = 0;
        boolean[] passed = new boolean[N];
        for (int i = 0; !passed[i]; i = a[i], sum++) {
            passed[i] = true;
            if (i == 1) {
                System.out.println(sum);
                return;
            }
        }
        System.out.println(-1);
    }
}
