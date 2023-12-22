import java.util.*;

class Job {
    final int time;
    final int limit;

    Job(int time, int limit) {
        this.time = time;
        this.limit = limit;
    }
}

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        PriorityQueue<Job> jobs = new PriorityQueue<>(Comparator.comparing(j -> j.limit));
        for (int i = 0; i < N; i++) {
            jobs.add(new Job(sc.nextInt(), sc.nextInt()));
        }

        System.out.println(check(jobs) ? "Yes" : "No");
    }

    boolean check(Queue<Job> jobs) {
        int current = 0;
        while (!jobs.isEmpty()) {
            Job job = jobs.poll();
            current += job.time;
            if (current > job.limit) return false;
        }

        return true;
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}