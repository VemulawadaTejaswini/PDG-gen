import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int length = map.size();
        int[] results = new int[length + 1];
        int idx = 0;
        for (int x : map.values()) {
            results[idx] = x;
            idx++;
        }
        Arrays.sort(results);
        for (int i = 1; i <= length; i++) {
            results[i] += results[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int k;
            if (i > length) {
                k = 0;
            } else {
                k = Math.min(n / (i + 1), results[length - i]);
            }
            sb.append(k).append("\n");
        }
        System.out.print(sb);
    }
}