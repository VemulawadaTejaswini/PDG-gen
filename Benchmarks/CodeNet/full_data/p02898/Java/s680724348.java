import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() >= k) cnt++;
        }
        System.out.println(cnt);
    }
}

