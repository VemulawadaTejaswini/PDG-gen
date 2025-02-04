import java.util.Scanner;

public class Main {
    static final int MAX_N = 200000;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean[] c = new boolean[MAX_N+1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 1) {
                if (c[b]) {
                    System.out.println("POSSIBLE");
                    return;
                } else {
                    c[b] = true;
                }
            }
            if (b == n) {
                if (c[a]) {
                    System.out.println("POSSIBLE");
                    return;
                } else {
                    c[a] = true;
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
