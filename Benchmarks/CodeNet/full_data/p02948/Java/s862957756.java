import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Job[] jobs = new Job[N];
    for (int i = 0; i < N; i++) jobs[i] = new Job(scanner.nextInt(), scanner.nextInt());
    Arrays.sort(jobs, Comparator.comparingInt(j -> j.due));

    int ans = 0;
    int j = 0;
    PriorityQueue<Job> pq = new PriorityQueue<>();
    for (int i = 1; i <= M; i++) {
      while (j < N && jobs[j].due <= i) pq.add(jobs[j++]);
      if (!pq.isEmpty()) ans += pq.poll().reward;
    }
    System.out.println(ans);
  }

  private static class Job implements Comparable<Job> {
    private final int due;
    private final int reward;

    private Job(int due, int reward) {
      this.due = due;
      this.reward = reward;
    }

    @Override public int compareTo(Job job) {
      return job.reward - reward;
    }
  }
}
