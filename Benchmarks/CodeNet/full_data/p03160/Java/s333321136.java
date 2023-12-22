import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(input[i]);
        }

        System.out.println(getMinCost(h));
    }

    private static int getMinCost(int[] h) {
        int[] cost = new int[h.length];
        cost[1] = Math.abs(h[1] - h[0]);

        for (int i = 2; i < h.length; i++) {
             cost[i] = Math.min(cost[i-2] + Math.abs(h[i-2] - h[i]), cost[i-1] + Math.abs(h[i-1] - h[i]));
        }

        return cost[h.length-1];
    }
}
