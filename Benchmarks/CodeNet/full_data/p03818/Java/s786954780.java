import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
        long cnt = 0;
        for (Entry<Integer, Integer> e : map.entrySet()) {
            cnt += e.getValue() - 1;
        }
        if (cnt % 2 == 0) {
            System.out.println(map.size());
        } else {
            System.out.println(map.size() - 1);
        }
    }

}
