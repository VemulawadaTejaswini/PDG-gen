import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        List<Integer> minusList = x.stream().filter(i -> i < 0).collect(Collectors.toList());
        List<Integer> plusList = x.stream().filter(i -> 0 < i).collect(Collectors.toList());

        List<Integer> leftDoubleList = new ArrayList<>();
        leftDoubleList.addAll(minusList.stream().map(i -> i * 2).collect(Collectors.toList()));
        leftDoubleList.add(0);
        leftDoubleList.addAll(plusList);

        List<Integer> rightDoubleList = new ArrayList<>();
        rightDoubleList.addAll(minusList);
        rightDoubleList.add(0);
        rightDoubleList.addAll(plusList.stream().map(i -> i * 2).collect(Collectors.toList()));

        if (!x.contains(0)) {
            k++;
        }

        int firstIndex = Math.max(0, minusList.size() - k + 1);
        int lastIndex = Math.min(leftDoubleList.size() - k, minusList.size());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = firstIndex; i <= lastIndex; i++) {
            pq.add(rightDoubleList.get(i + k - 1) - rightDoubleList.get(i));
            pq.add(leftDoubleList.get(i + k - 1) - leftDoubleList.get(i));
        }
        int result = pq.peek();

        // 出力
        System.out.println(result);
    }
}
