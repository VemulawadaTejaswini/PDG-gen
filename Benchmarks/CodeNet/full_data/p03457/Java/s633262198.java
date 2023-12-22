import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N];
        int[] x = new int[N];
        int[] y = new int[N];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;

        for (int i = 1; i < N; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean go = false;
        for (int i = 1; i < N; i++) {
            if (x[i] + y[i] >= t[i] - t[i - 1] && (x[i] + y[i]) % 2 == (t[i] - t[i - 1]) % 2) {
                go = true;
            } else {
                go = false;
                break;
            }
        }
        if (go) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}