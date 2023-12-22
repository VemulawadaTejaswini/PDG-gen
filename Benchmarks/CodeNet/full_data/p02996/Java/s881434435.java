
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final int n = sysin.nextInt();
		List<Job> jobs = IntStream.range(0, n)
							.mapToObj(i -> new Job(sysin.nextInt(), sysin.nextInt()))
							.sorted()
							.collect(Collectors.toList());
		sysin.close();

		int now = 0;
		for (Job job : jobs) {
			now += job.time;
			if (job.deadline < now) {
				System.out.println("No");
				System.exit(0);
			}
		}

		System.out.println("Yes");
	}

}

class Job implements Comparable<Job>{
	public final int time, deadline;

	public Job(int time, int deadline) {
		this.time = time;
		this.deadline = deadline;
	}

	@Override
	public int compareTo(Job o) {
		return this.deadline - o.deadline;
	}
}