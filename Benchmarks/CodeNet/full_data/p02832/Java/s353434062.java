
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int index = 1;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (index == a[i]) {
                index++;
            } else {
                ans++;
            }
        }

        if (index > 1) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}
