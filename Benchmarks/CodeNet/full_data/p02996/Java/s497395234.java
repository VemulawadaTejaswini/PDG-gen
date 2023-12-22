import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Job[] jobs = new Job[n];
			IntStream.range(0, n).forEach(i -> jobs[i] = new Job(scanner.nextInt(), scanner.nextInt()));
			Arrays.sort(jobs);
			int sum = 0;
			for (Job job : jobs) {
				sum += job.time;
				if (sum > job.dueTo) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}

	private static class Job implements Comparable<Job> {
		/** 仕事をこなすための時間 */
		int time;
		/** 仕事の締め切り時間 */
		int dueTo;

		Job(int time, int dueTo) {
			super();
			this.time = time;
			this.dueTo = dueTo;
		}

		@Override
		public int compareTo(Job job) {
			if (0 == (this.dueTo - job.dueTo)) {
				return this.time - job.time;
			} else {
				return this.dueTo - job.dueTo;
			}
		}
	}
}
