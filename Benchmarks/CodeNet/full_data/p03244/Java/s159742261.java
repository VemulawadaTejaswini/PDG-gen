import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> mapEven = new HashMap<>();
        HashMap<Integer, Integer> mapOdd = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (i % 2 == 0) {
                mapEven.put(num, mapEven.getOrDefault(num, 0)+1);
            } else {
                mapOdd.put(num, mapOdd.getOrDefault(num, 0)+1);
            }
        }
        List<Map.Entry<Integer, Integer>> odd = new ArrayList<>(mapOdd.entrySet());
        List<Map.Entry<Integer, Integer>> even = new ArrayList<>(mapEven.entrySet());
        odd.sort((o1, o2) -> o2.getValue() - o1.getValue());
        even.sort((e1, e2) -> e2.getValue() - e1.getValue());

        int o1 = odd.get(0).getValue();
        int o2 = odd.size() == 1 ? 0 : odd.get(1).getValue();
        int e1 = even.get(0).getValue();
        int e2 = even.size() == 1 ? 0 : even.get(1).getValue();
        if (!odd.get(0).getKey().equals(even.get(0).getKey())) {
            System.out.println(n - o1 - e1);
        }
        else {
            System.out.println(n - Math.max(o1 + e2, o2 + e1));
        }
    }
}