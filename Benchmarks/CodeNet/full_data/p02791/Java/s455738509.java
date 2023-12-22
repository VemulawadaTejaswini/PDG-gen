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
        int[] P = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (min >= P[i]) {
                min = P[i];
                cnt++;
            }
        }

        System.out.println(cnt);
        return;
    }

}