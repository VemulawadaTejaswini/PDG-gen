import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N+1];
        int[] x = new int[N+1];
        int[] y = new int[N+1];

        for (int i = 1; i <= N; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 1; i <= N; i++) {
            int load = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
            int time = t[i] - t[i - 1];
            if (time < load || load % 2 != time % 2) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}