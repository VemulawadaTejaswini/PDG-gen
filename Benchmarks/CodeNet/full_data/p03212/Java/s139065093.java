import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    private int N;

    public void run() {
        N = sc.nextInt();
        int ans = dfs(0);
        System.out.println(ans);
    }

    private int dfs(long x) {
        if (x > N) {
            return 0;
        }
        int count = 0;
        String s = String.valueOf(x);
        if (s.contains("3") && s.contains("5") && s.contains("7")) {
            count++;
        }
        count += dfs(10 * x + 3) + dfs(10 * x + 5) + dfs(10 * x + 7);
        return count;
    }
}