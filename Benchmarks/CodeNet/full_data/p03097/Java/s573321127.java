
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int n, a, b;

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        if (Integer.bitCount(a^b) % 2 == 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        boolean[] used = new boolean[1 << n];
        used[a] = true;
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < n; j++) {
                int next = a ^ (1 << j);
                if (!used[next] && next != b) {
                    used[next] = true;
                    System.out.print(a + " ");
                    a = next;
                    break;
                }
            }
        }
        System.out.println(b);
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
