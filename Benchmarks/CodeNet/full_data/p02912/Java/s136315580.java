import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int M;
        long[] Ai;

        Comparator<Double> comp = Comparator.comparingDouble(d->d.doubleValue());
        PriorityQueue<Double> pq = new PriorityQueue<>(comp.reversed());

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();

            Ai = new long[N];
            for (int i = 0; i < Ai.length; i++) {
                Ai[i] = sc.nextLong();
            }
        }
        for(long l : Ai){
            pq.add((double) l);
        }
        Double d ;
        while(M >0){
            d = pq.poll();
            double temp = d/2;
            pq.add(temp);
            M--;
        }
        long result = 0;
        while((d = pq.poll()) != null){
            result += Math.floor(d);
        }
        System.out.println(result);
    }
}
