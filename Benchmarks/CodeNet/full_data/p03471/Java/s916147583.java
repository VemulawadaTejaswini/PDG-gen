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
        int Y = sc.nextInt();


        int y = Y/1000;
        for (int i = 0 ; i <= N; i++) {
            for (int j = 0 ; (i + j) <= N; j++) {
                int k = N - (i + j);
                if (i * 10 + j * 5 + k == y) {
                    System.out.println(String.format("%d %d %d", i, j, k));
                    return;
                }
            }
        }
        System.out.println(String.format("%d %d %d", -1, -1, -1));

        return;
    }

}