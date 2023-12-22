import java.util.Scanner;

public class Main {


    void solve() {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = L; i <= R; i++) {
            for (int j = i + 1; j <= R; j++) {
                int ij = (i % 2019) * (j % 2019);
                min = Math.min(min, ij);
            }
        }
        System.out.print(min);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

