import java.util.*;

class Match implements Comparable<Match> {
    final Set<Match> before = new HashSet<>();
    final Set<Match> after = new HashSet<>();
    final int a;
    final int b;

    Match(int a, int b) {
        if (a > b) {
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    boolean conflicts(Match match) {
        return a == match.a || b == match.b || a == match.b || b == match.a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return a == match.a &&
                b == match.b;
    }

    @Override
    public String toString() {
        return "(" + a +
                ", " + b +
                ')';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public int compareTo(Match o) {
        if (before.contains(o)) return 1;
        if (after.contains(o)) return -1;
        return 0;
    }
}

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        Map<Match, Match> allMatch = new HashMap<>();
        Match[] before = new Match[N - 1];
        for (int i = 0; i < N; i++) {
            Arrays.fill(before, null);
            for (int j = 0; j < N - 1; j++) {
                Match match = new Match(i + 1, in.nextInt());
                allMatch.putIfAbsent(match, match);
                match = allMatch.get(match);
                for (Match b : before) {
                    if (b != null) {
                        match.before.add(b);
                        b.after.add(match);
                    }
                }
                before[j] = match;
            }
        }
        Match[] matches = allMatch.keySet().stream().sorted().toArray(Match[]::new);
        Set<Match> day = new HashSet<>();
        int days = 1;
        for (int i = 0; i < matches.length; i++) {
            Match match = matches[i];
            if (Arrays.stream(matches, 0, i).mapToInt(m -> m.compareTo(match)).anyMatch(j -> j > 0)) {
                System.out.println(-1);
                return;
            }
            if (day.stream().anyMatch(m -> m.conflicts(match))) {
                days++;
                day.clear();
            }
            day.add(match);
        }
        System.out.println(days);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}