import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int[] count = new int[n+1];
        for (int i = 0; i < n-1; i++) {
            count[sc.nextInt()]++;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(count[i]);
        }

    }
}
