import java.util.Scanner;

public class Main {

    int n;
    int k;
    int[] h;

    Main(int n, int k, int[] h) {
        this.n = n;
        this.k = k;
        this.h = h;
    }

    /**
     * 
     * @return greeting message
     */
    public int solve() {

        int p = 0;

        for (int hi : h) {
            if (hi >= k) {
                p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        // solve
        int p = new Main(n, k, h).solve();

        // display
        System.out.println(p);
    }

}
