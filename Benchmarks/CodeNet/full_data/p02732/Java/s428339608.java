import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp;
            map.merge(temp, 1, Integer::sum);
        }
        long ans = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            ans += e.getValue() * (e.getValue() - 1) / 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans - (map.get(a[i]) - 1));
        }
    }
}