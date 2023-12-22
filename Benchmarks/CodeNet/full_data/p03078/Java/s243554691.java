import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] xs = new long[x];
        long[] ys = new long[y];
        long[] zs = new long[z];
        for (int i = 0; i < x; i++) {
            xs[i] = sc.nextLong();
        }
        for (int j = 0; j < y; j++) {
            ys[j] = sc.nextLong();
        }
        for (int l = 0; l < z; l++) {
            zs[l] = sc.nextLong();
        }
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int l = 0; l < z; l++) {
                    long sum = xs[i] + ys[j] + zs[l];
                    if (pq.size() == k && pq.peek() < sum) {
                        pq.poll();
                        pq.add(sum);
                    } else if (pq.size() < k) {
                        pq.add(sum);
                    }
                }
            }
        }
        int index = 0;
        long[] array = new long[k];
        while(!pq.isEmpty()) {
            array[index] = pq.poll();
            index++;
        }
        for(int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

