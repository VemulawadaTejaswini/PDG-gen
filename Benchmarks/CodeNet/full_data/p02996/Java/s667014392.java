import java.util.Arrays;
import java.util.Scanner;

public class ABC131D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			Task[] t = new Task[N];

			for (int i = 0; i < t.length; ++i) {
				t[i] = new Task(in.nextInt(), in.nextInt());
			}
			
			Arrays.sort(t);
			
			long time = 0;
			boolean canCompleteAll = true;
			for (int i = 0; i < t.length; ++i) {
				time += t[i].unit;
				
				if (time > t[i].deadline) {
					canCompleteAll = false;
					break;
				}
			}
			
			if (canCompleteAll) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

	private static class Task implements Comparable<Task>{
		int unit;
		int deadline;

		Task(int startTime, int endTime) {
			this.unit = startTime;
			this.deadline = endTime;
		}

		@Override
		public int compareTo(Task o) {
			if (this.deadline != o.deadline) {
				return this.deadline - o.deadline;
			} else {
				return this.unit - o.unit;
			}
		}
	}

}
