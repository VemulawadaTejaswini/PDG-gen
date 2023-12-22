import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int[] dp;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] line = reader.readLine().split(" ");

        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);


        input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp = new int[input.length];
        List<Integer> backwards;
        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            backwards = new ArrayList<>();
            for (int j = i - 1, c = 0; j >= 0 && c < k; j--, c++) {
                backwards.add(Math.abs(input[i] - input[j]) + dp[j]);
            }

            dp[i] = backwards.stream().min(Integer::compare).get();

        }

        System.out.println(dp[n - 1]);
    }




}
