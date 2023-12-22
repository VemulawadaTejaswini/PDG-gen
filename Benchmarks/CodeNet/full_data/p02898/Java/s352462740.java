import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] h = new int[N];
        int ans = 0;
        for(int i = 0; i < N; i++) {
            h[i] = scanner.nextInt();
            if(K <= h[i]) ans++;
        }

        System.out.println(ans);
    }
}
