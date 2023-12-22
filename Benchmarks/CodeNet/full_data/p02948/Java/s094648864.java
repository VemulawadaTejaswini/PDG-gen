import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Job implements Comparable<Job> {
	int a;
	int b;

	Job(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Job otherJob) {
		if (otherJob.a == this.a) return this.b - otherJob.b;
		else return this.a - otherJob.a;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);

		Queue<Job> q = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			line = sc.nextLine().split(" ");
			q.add(new Job(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
		}

		int cnt = 0;
		List<Job> jobList = new ArrayList<>();
		for (int i = 1; i <= M; i++) {
			while (!q.isEmpty()) {
				Job job = q.peek();
				if (job.a <= i) {
					jobList.add(q.poll());
				}
				else break;
			}
			if (jobList.size() > 0) {
				jobList.sort((s1, s2) -> s2.b - s1.b);
				cnt += jobList.remove(0).b;
			}
		}
		System.out.println(cnt);
	}
}