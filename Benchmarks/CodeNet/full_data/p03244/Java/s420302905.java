import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int[][] findMode(Map<Integer, Integer> map) {
        int[][] ans = new int[2][2];
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int val = e.getValue();
            if (val <= ans[1][1]) {
                continue;
            }
            if (val > ans[0][1]) {
                ans[1][0] = ans[0][0];
                ans[1][1] = ans[0][1];
                ans[0][0] = key;
                ans[0][1] = val;
            } else {
                ans[1][0] = key;
                ans[1][1] = val;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        Map<Integer, Integer> odd = new HashMap<>();
        Map<Integer, Integer> even = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = v[i];
            if (i % 2 == 0) {
                even.put(num, even.getOrDefault(num, 0) + 1);
                continue;
            }
            odd.put(num, odd.getOrDefault(num, 0) + 1);
        }
        int[][] oddFreqs = findMode(odd);
        int[][] evenFreqs = findMode(even);

        if (oddFreqs[0][0] == evenFreqs[0][0]) {
            System.out.println(Math.min(
                    n - oddFreqs[1][1] - evenFreqs[0][1],
                    n - oddFreqs[0][1] - evenFreqs[1][1]
            ));
            return;
        }
        System.out.println(n - oddFreqs[0][1] - evenFreqs[0][1]);
    }

}
