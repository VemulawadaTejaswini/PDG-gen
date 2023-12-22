import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(reader.readLine());

        boolean[][] compatible = new boolean[count][count];

        for (int i = 0; i < count; ++i) {
            String[] parts = reader.readLine().split(" ");
            for (int j = 0; j < count; ++j) {
                if (Integer.valueOf(parts[j]) == 1) {
                    compatible[i][j] = true;
                }
            }
        }
        long modulo = 1_000_000_007;

        int combinationCount = 1 << count;

        long[] counts = new long[combinationCount];
        counts[0] = 1;

        Set<Integer> combinations = new HashSet<>();
        combinations.add(0);

        for (int i = 0; i < count; ++i) {
            Set<Integer> newCombinations = new HashSet<>();
            for (int combination : combinations) {
                for (int j = 0; j < count; ++j) {
                    if (compatible[i][j] && (combination & (1 << j)) == 0) {
                        int newCombination = combination | (1 << j);
                        newCombinations.add(newCombination);
                        counts[newCombination] += counts[combination];
                        counts[newCombination] %= modulo;
                    }
                }
            }
            combinations = newCombinations;
        }

        long res = 0;
        for (int combination : combinations) {
            res += counts[combination];
            res %= modulo;
        }
        System.out.println(res);
    }
}
