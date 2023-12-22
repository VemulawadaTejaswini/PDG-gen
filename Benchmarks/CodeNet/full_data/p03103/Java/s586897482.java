import java.util.*;

public class Main {


    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final int[] A = new int[N];
        final int[] B = new int[N];

        final PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                if (e1.getKey() < e2.getKey()) {
                    return -1;
                }
                if (e1.getKey() > e2.getKey()) {
                    return +1;
                }
                return 0;
            }
        });

        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
            pq.offer(new AbstractMap.SimpleEntry<>(A[i], i));
            B[i] = sc.nextInt();
        }

        int leftToBuy = M;
        long money = 0;

        while (!pq.isEmpty() && leftToBuy > 0) {
            final Map.Entry<Integer, Integer> entry = pq.poll();
            final int price = entry.getKey();
            final int index = entry.getValue();
            money += (Math.min(B[index], leftToBuy))*price;
            leftToBuy -= Math.min(B[index], leftToBuy);
        }


        System.out.println(money);
        System.out.flush();
        sc.close();
    }
}
