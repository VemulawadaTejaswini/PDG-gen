import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));

        // 主処理
        PriorityQueue<Integer> side = new PriorityQueue<>(Collections.reverseOrder());
        side.addAll(Arrays.asList(a));
        List<Integer> list = new ArrayList<>();
        while (1 < side.size()) {
            if (side.poll() == side.peek()) {
                list.add(side.poll());
            }
        }

        long result = 0;
        if (2 <= list.size()) {
            result = (long) list.get(0) * list.get(1);
        }
        // 出力
        System.out.println(result);
        sc.close();
    }
}
