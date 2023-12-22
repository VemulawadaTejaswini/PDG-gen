import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nanbon = new int[N];
        for (int i = 0; i < M; i++) {
            nanbon[sc.nextInt() - 1]++;
            nanbon[sc.nextInt() - 1]++;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(nanbon[i]);
        }
    }
}
