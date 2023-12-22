import java.util.*;

class Albeit {
    final int reward;
    private final int days;

    Albeit(int days, int reward) {
        this.days = days;
        this.reward = reward;
    }

    boolean canEarn(int remaining) {
        return remaining > days;
    }

    @Override
    public String toString() {
        return "Albeit{" +
                "days=" + days +
                ", money=" + reward +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Albeit albeit = (Albeit) o;
        return reward == albeit.reward &&
                days == albeit.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reward, days);
    }
}

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Albeit> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(new Albeit(sc.nextInt(), sc.nextInt()));
        }
        int sum = 0;
        for (int m = M + 1; m > 1; m--) {
            int finalM = m;
            Optional<Albeit> max = set.stream().filter(a -> a.canEarn(finalM)).max(Comparator.comparing(a -> a.reward));
            max.ifPresent(set::remove);
            sum += max.map(a -> a.reward).orElse(0);
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