import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), K = scanner.nextInt();
        scanner.nextLine();
        int[][] points = new int[N][N];
        for (int i = 0; i < N; i++) {
            points[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] xs = Arrays.stream(points).mapToInt(x -> x[0]).sorted().toArray();
        int[] ys = Arrays.stream(points).mapToInt(x -> x[1]).sorted().toArray();
        long ans = Long.MAX_VALUE;
        for (int xf = 0; xf < xs.length; xf++) {
            for (int xt = xf + 1; xt < xs.length; xt++) {
                for (int yf = 0; yf < ys.length; yf++) {
                    for (int yt = yf + 1; yt < ys.length; yt++) {
                        int cnt = 0;
                        for (int[] p: points) {
                            if (p[0] >= xs[xf] && p[0] <= xs[xt] && p[1] >= ys[yf] && p[1] <= ys[yt]) {
                                cnt++;
                            }
                        }
                        if (cnt >= K) {
                            ans = Math.min(ans, (xs[xt] - xs[xf]) * (long) (ys[yt] - ys[yf]));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

}