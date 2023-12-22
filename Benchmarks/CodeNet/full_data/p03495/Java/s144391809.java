import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            map.merge(a, 1, Integer::sum);
        }
        if (map.size() <= k) {
            System.out.println(0);
        } else {
            int sub = map.size() - k;
            List<Integer> list = new ArrayList<>();
            map.entrySet().stream()
                    .sorted(java.util.Map.Entry.comparingByValue())
                    .forEach(s -> list.add(s.getValue()));
            int ans = 0;
            for (int i = 0; i < sub; i++) {
                ans += list.get(i);
            }
            System.out.println(ans);
        }
    }
}