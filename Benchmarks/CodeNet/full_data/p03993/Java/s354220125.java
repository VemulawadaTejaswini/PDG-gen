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
            map.put(i + 1, a[i]);
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            int k = map.get(i);
            if (!map.containsKey(k)) {
                continue;
            }
            if (i == map.get(k)) {
                sum++;
            }
        }
        System.out.println(sum / 2);
    }

}
