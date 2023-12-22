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
        int M = sc.nextInt();

        int cnt = 0;
        if (N == 1 && M == 1) {
            cnt = 1;
        } else if (N == 1) {
            cnt = M - 2;
        } else if (M == 1) {
            cnt = N - 2;
        } else {
            cnt = (N - 2) * (M - 2);
        }

        System.out.println(cnt);
        return;
    }

}