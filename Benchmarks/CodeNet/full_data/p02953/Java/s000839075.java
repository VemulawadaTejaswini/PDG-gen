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
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            if (H[i] <= H[i + 1] - 1) {
                // ok. making H[i + 1] lower than current status.
                H[i + 1] -= 1;
            } else if (H[i] == H[i + 1]) {
                // ok. no change.
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }

}