import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 0;
        for(int i = 1; i < N; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}