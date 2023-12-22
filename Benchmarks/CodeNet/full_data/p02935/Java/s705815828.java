import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Double> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.offer(sc.nextDouble());
        }

        while (pq.size() > 2) {
            double v1 = pq.poll();
            double v2 = pq.poll();

            pq.offer((v1 + v2)/2);
        }

        double v1 = pq.poll();
        double v2 = pq.poll();
        double value = (v1 + v2) / 2.0;
        System.out.println(value);

        return;
    }

}