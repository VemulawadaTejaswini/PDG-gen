import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        long sum = 0;
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            sum += (val * (val - 1)) / 2;
        }
        for (int i = 0; i < n; i++) {
            int val = map.get(a[i]);
            System.out.println(sum - val + 1);
        }
    }

}
