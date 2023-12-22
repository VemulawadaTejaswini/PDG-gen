import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] Ai = new int[N];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i=0; i<N; i++) {
            Ai[i] = scanner.nextInt();
            Integer count = countMap.get(Ai[i]);
            if (count == null) {
                countMap.put(Ai[i], 1);
            } else {
                countMap.put(Ai[i], count + 1);
            }
        }

        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int k=0; k < N; k++) {
            Integer result = sumMap.get(Ai[k]);
            if (result == null) {
                result = getCombination(countMap, Ai, k);
                sumMap.put(Ai[k], result);
            }
            System.out.println(result);
        }
    }

    private static int getCombination(Map<Integer, Integer> countMap, int[] ai, int k) {
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (ai[k] == entry.getKey()) {
                count--;
            }
            sum += (count * (count - 1))/2;
        }
        return sum;
    }
}