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
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        long l = 1;
        for (int i = 0; i < N; i++) {
            l *= a[i];
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (l - 1) % a[i];
        }

        System.out.println(ans);
        return;
    }

}