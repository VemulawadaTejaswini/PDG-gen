import java.util.*;

class Albeit {
    final int reward;
    final int days;

    Albeit(int days, int reward) {
        this.days = days;
        this.reward = reward;
    }

    boolean canEarn(int remaining) {
        return remaining > days;
    }
}

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<Albeit> queue = new PriorityQueue<>(Comparator.comparingInt((Albeit a) -> a.reward).reversed().thenComparingInt(a -> a.days));
        for (int i = 0; i < N; i++) {
            queue.add(new Albeit(sc.nextInt(), sc.nextInt()));
        }
        int sum = 0;
        for (int i = 2; i <= M + 1; i++) {
            Albeit peek = queue.poll();
            if (peek == null) break;
            while (peek != null && !peek.canEarn(i)) {
                peek = queue.poll();
            }
            if (peek == null) break;
            sum += peek.reward;
        }
        System.out.println(sum);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}