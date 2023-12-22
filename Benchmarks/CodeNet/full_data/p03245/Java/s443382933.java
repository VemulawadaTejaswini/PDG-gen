import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; ++i) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        System.out.println(solve(X, Y));

        sc.close();
    }

    static String solve(int[] X, int[] Y) {
        if (IntStream.range(0, X.length).map(i -> Math.abs((X[i] + Y[i]) % 2)).distinct().count() != 1) {
            return "-1";
        }

        int m = 40 - Math.abs((X[0] + Y[0]) % 2);
        int[] d = IntStream.range(0, m).map(i -> 1).toArray();

        String[] w = new String[X.length];
        for (int i = 0; i < w.length; ++i) {
            w[i] = computePath(m, X[i], Y[i]);
        }

        return String.format("%d\n%s\n%s", m,
                Arrays.stream(d).mapToObj(String::valueOf).collect(Collectors.joining(" ")), String.join("\n", w));
    }

    static String computePath(int m, int x, int y) {
        StringBuilder path = new StringBuilder();
        for (int i = 0; i < -x; ++i) {
            path.append('L');
        }
        for (int i = 0; i < x; ++i) {
            path.append('R');
        }
        for (int i = 0; i < -y; ++i) {
            path.append('D');
        }
        for (int i = 0; i < y; ++i) {
            path.append('U');
        }

        while (path.length() != m) {
            path.append((path.length() % 2 == 0) ? 'L' : 'R');
        }

        return path.toString();
    }
}