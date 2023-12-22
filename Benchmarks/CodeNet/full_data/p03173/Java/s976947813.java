import java.io.IOException;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<BigInteger> pQueue = new PriorityQueue<>();
        BigInteger cost = new BigInteger("0");
        for(int i=0;i<n;i++) {
            pQueue.add(sc.nextBigInteger());
        }
        while (pQueue.size() != 1) {
            BigInteger first = pQueue.poll();
            BigInteger second = pQueue.poll();
            BigInteger dummyCost = first.add(second);
            pQueue.add(dummyCost);
            cost = cost.add(dummyCost);
        }
        System.out.println(cost);
    }
}
