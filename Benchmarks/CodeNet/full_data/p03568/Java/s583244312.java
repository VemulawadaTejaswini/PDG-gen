import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < N; i++) {
            if (sc.nextInt() % 2 == 0) {
                ans *= 2;
            }
        }
        System.out.println((int) Math.pow(3, N) - ans);
    }
}
