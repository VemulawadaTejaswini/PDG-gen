import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.compute(a, (key, value) -> value == null ? 1 : value + 1);
        }

        int res = 0;
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int i = 0; i < list.size() - k; i++) {
            res += list.get(i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
