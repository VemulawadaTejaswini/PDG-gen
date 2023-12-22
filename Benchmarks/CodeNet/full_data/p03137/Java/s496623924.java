import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }

        Arrays.sort(X);

        final int[] dist = new int[M-1];
        for (int i = 1; i < M; i++) {
            dist[i-1] = Math.abs(X[i] - X[i-1]);
        }

        List<Integer> induces = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < N-1; i++) {
            int diff = Integer.MIN_VALUE;
            for (int j = index+1; j < M-1; j++) {
                if (diff < Math.abs(X[j+1] - X[j])) {
                    diff = Math.abs(X[j+1] - X[j]);
                    index = j;
                }
            }
            induces.add(index);
        }

        int ans = 0;
        for (int i = 0; i < M-1; i++) {
            if (!induces.contains(Integer.valueOf(i))) {
                ans += dist[i];
            }
        }

        System.out.println(ans);
    }
}
