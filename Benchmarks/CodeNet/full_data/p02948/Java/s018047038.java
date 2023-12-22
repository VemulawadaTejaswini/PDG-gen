import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    static class Job implements Comparable<Job> {
        int days;
        int reward;

        public Job(int days, int reward) {
            this.days = days;
            this.reward = reward;
        }

        @Override
        public int compareTo(Job other) {
            return other.reward - this.reward;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Job[] jobs = new Job[N];

        for (int i = 0; i < N; i++) {
            jobs[i] = new Job(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(jobs);

        NavigableSet<Integer> free = new TreeSet<>();
        for (int i = 0; i < M; i++) free.add(i);

        int sol = 0;

        for (Job job : jobs) {
            Integer day = free.floor(M - job.days);
            if (day == null) continue;
            sol += job.reward;
            free.remove(day);
        }

        System.out.println(sol);
    }
}