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
                long num = xs[i] + ys[j];
                if(pq.size() < k) {
                    pq.add(num);
                } else if(pq.peek() < num) {
                    pq.poll();
                    pq.add(num);
                }
            }
        }
        PriorityQueue<Long> pq2 = new PriorityQueue<>();
        while(!pq.isEmpty()) {
            long pqNum = pq.poll();
            for (int j = 0; j < z; j++) {
                long num = pqNum + zs[j];
                if(pq2.size() < k) {
                    pq2.add(num);
                } else if(pq2.peek() < num) {
                    pq2.poll();
                    pq2.add(num);
                }
            }
        }
        String answer = "";
        while(!pq2.isEmpty()) {
            answer = (pq2.poll() + "\n") + answer;
        }
        System.out.print(answer);
    }
}
