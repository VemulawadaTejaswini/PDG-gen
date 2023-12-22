import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t[] = new int[N + 1];
        int x[] = new int[N + 1];
        int y[] = new int[N + 1];
        boolean ans = true;
        int time = 0;
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for (int i = 1; N + 1 > i; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int j = 1; N + 1 > j; j++) {
            time = Math.abs(t[j] - t[j - 1]);
            if (time < Math.abs(x[j] - x[j - 1]) + Math.abs(y[j] - y[j - 1])) {
                ans = false;
                break;
            }
            if (time == x[j] + y[j]) {
                continue;
            } else if (time % 2 == 0 && (Math.abs(x[j] - x[j - 1]) + Math.abs(y[j] - y[j - 1])) % 2 == 0) {
                continue;
            } else if (time % 2 != 0 && (Math.abs(x[j] - x[j - 1]) + Math.abs(y[j] - y[j - 1])) % 2 != 0) {
                continue;
            } else {
                ans = false;
                break;
            }
        }
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}