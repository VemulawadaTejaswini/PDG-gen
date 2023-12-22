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
        int cost = 0;
        int i = h.length - 1;

        while(i > 2) {
            int cost1 = Math.abs(h[i] - h[i-1]);
            int cost2 = Math.abs(h[i] - h[i-2]);

            if(cost1 < cost2) {
                cost += cost1;
                i--;
            } else {
                cost += cost2;
                i -= 2;
            }
        }

        cost += Math.abs(h[i] - h[0]);

        return cost;
    }
}