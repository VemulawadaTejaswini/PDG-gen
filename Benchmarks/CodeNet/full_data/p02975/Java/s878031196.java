import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if (a[i] == 0) {
                countZero++;
            }
        }
        sc.close();

        // 主処理
        boolean judge;
        if (countZero == n) {
            judge = true;
        } else if (countZero == n / 3) {
            Set<Integer> set = new HashSet<>(Arrays.asList(a));
            judge = set.size() == 2;
        } else if (n % 3 == 0 && countZero % (n / 3) == 0) {
            Set<Integer> set = new HashSet<>(Arrays.asList(a));
            if (set.size() == 3) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int num : set) {
                    map.put(num, 0);
                }
                for (int i = 0; i < n; i++) {
                    map.put(a[i], map.get(a[i]) + 1);
                }
                Set<Integer> valueSet = new HashSet<>();
                for (int key : map.keySet()) {
                    valueSet.add(map.get(key));
                }
                judge = valueSet.size() == 1;
            } else {
                judge = false;
            }
        } else {
            judge = false;
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
