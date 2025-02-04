import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N+1];
        int[] x = new int[N+1];
        int[] y = new int[N+1];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;

        for (int i = 1; i <= N; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean go = false;
        for (int i = 1; i <= N; i++) {
            int load = Math.abs(x[i]-x[i-1]) + Math.abs(y[i]-y[i-1]);
            int time = t[i] - t[i - 1];
            if (time >= load && (load) % 2 == (time) % 2) {
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