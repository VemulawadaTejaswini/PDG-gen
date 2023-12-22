import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long h = Long.parseLong(sc.next());
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
            b[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        long maxA = Arrays.stream(a).mapToLong(i -> i).max().orElse(0);
        List<Long> list = Arrays.asList(b).stream().filter(i -> maxA <= i).collect(Collectors.toList());
        long sum = list.stream().mapToLong(i -> i).sum();
        int result = 0;
        if (h < sum) {
            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(list);
            while (0 < h) {
                h -= pq.poll();
                result++;
            }
        } else {
            h -= sum;
            result += list.size() + Math.ceil((double) h / maxA);
        }

        // 出力
        System.out.println(result);
    }
}
