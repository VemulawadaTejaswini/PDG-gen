import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (i % 2 == 0) {
                int count = map1.getOrDefault(val, 0);
                map1.put(val, ++count);
            } else {
                int count = map2.getOrDefault(val, 0);
                map2.put(val, ++count);
            }
        }

        List<Map.Entry<Integer, Integer>> list1 = new ArrayList<>(map1.entrySet());
        list1.sort((e1, e2) -> (e2.getValue() - e1.getValue()));
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map2.entrySet());
        list2.sort((e1, e2) -> (e2.getValue() - e1.getValue()));

        int size = n / 2;
        if (!list1.get(0).getKey().equals(list2.get(0).getKey())) {
            int res = size - list1.get(0).getValue();
            res+= size - list2.get(0).getValue();
            System.out.println(res);
        } else {
            if (size == 1) {
                System.out.println(1);
            } else {

                int p1 = 2 * size - list1.get(0).getValue();
                if (list2.size() > 1) p1 -= list2.get(1).getValue();
                int p2 = 2 * size - list2.get(0).getValue();
                if (list1.size() > 1) p2 -= list1.get(1).getValue();
                System.out.println(Math.min(p1, p2));
            }
        }

    }
}