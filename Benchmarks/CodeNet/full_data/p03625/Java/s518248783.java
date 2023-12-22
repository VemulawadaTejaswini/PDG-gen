import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Long, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            map.merge(a, 1, Integer::sum);
        }
        List<Long> list = new ArrayList<>();
        for (Map.Entry<Long, Integer> m : map.entrySet()) {
            if (m.getValue() >= 2) {
                list.add(m.getKey());
                if (list.size() == 2) {
                    break;
                }
            }
        }
        if (list.size() < 2) {
            System.out.println(0);
        } else {
            System.out.println(list.get(0) * list.get(1));
        }
    }
}