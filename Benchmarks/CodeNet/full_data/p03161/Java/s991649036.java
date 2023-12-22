import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] one = br.readLine().split(" ");
        String[] two = br.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int k = Integer.parseInt(one[1]);

        int[] hs = new int[n];
        Arrays.setAll(hs, i -> Integer.parseInt(two[i]));

        int[] costs = new int[n];
        Arrays.fill(costs, 100000);
        costs[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = Math.max(i - k, 0); j < i; j++) {
                costs[i] = Math.min(costs[i], costs[j] + Math.abs(hs[i] - hs[j]));
            }
        }
        System.out.println(costs[n - 1]);

    }
}