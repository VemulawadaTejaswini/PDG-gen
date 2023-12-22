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
        for (int i = 0; i < n; i++) {
            int ans = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                int num = e.getValue();
                if (e.getKey() == a[i]) {
                    num--;
                }
                ans += num * (num - 1) / 2;
            }
            System.out.println(ans);
        }
    }
}