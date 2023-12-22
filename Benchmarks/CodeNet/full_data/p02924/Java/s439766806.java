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

        // gen
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }

        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += A[i];
        }

        System.out.println(sum);
        return;
    }

}