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
        PriorityQueue<Albeit> queue = new PriorityQueue<>(Comparator.comparingInt((Albeit a) -> a.reward).reversed());
        for (int i = 0; i < N; i++) {
            queue.add(new Albeit(sc.nextInt(), sc.nextInt()));
        }
        int sum = 0;
        for (int i = 2; i <= M + 1; i++) {
            Iterator<Albeit> iter = queue.iterator();
            while (iter.hasNext()){
                Albeit next = iter.next();
                if (next.canEarn(i)) {
                    sum += next.reward;
                    iter.remove();
                    break;
                }
            }
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