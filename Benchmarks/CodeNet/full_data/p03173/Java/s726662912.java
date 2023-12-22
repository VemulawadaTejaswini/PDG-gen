import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
 
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> pQueue = new PriorityQueue<>();
        long cost =0;
        for(int i=0;i<n;i++) {
            pQueue.add(sc.nextLong());
        }
        while (pQueue.size() != 1) {
            long first = pQueue.poll();
            long second = pQueue.poll();
            long dummyCost = (first + second);
            pQueue.add(dummyCost);
            cost = cost + dummyCost;
        }
        System.out.println(cost);
    }
}