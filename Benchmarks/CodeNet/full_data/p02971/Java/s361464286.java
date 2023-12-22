import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        int top1 = 0;
        int idx1 = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (top1 < A[i]) {
                top1 = A[i];
                idx1 = i;
            }
        }

        int top2 = 0;
        for (int i = 0; i < N; i++) {
            if (i != idx1  && top2 < A[i]) {
                top2 = A[i];
            }
        }

        long max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] == top1) {
                System.out.println(top2);
            } else {
                System.out.println(top1);
            }
        }

        return;
    }

}