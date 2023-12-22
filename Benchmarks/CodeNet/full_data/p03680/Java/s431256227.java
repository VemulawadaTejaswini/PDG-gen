import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        List<Integer> pushed = new ArrayList<>();
        int next = map.get(1);
        int count = 1;
        while (next != 2 && !pushed.contains(next)) {
            pushed.add(next);
            next = map.get(next);
            count++;
        }

        boolean judge = next == 2;
        int result = judge ? count : -1;

        // 出力
        System.out.println(result);
    }
}
