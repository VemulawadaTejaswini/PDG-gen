import java.util.Scanner;

public class Main {


    void solve() {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        long min = Long.MAX_VALUE;
        for (int i = L; i <= R; i++) {
            for (int j = i + 1; j <= R; j++) {
                long ij = ((long)i * j) % 2019;
                if (ij == 0) {
                    min = 0;
                    break;
                }
                min = Math.min(min, ij);
            }
            if (min == 0) {
                break;
            }
        }
        System.out.print(min);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

