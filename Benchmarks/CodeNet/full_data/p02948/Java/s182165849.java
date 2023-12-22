
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.exec();

	}

	private void exec() {
		int n;
		int m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		long[] mValue = new long[n];
		List<Task> taskList = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			taskList.add(new Task(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(taskList);
		for(Task task : taskList) {
			// 一番うしろの日
			int lastIndex = m - task.day;
			for(int i = lastIndex ; i >= 0 ; i--) {
				if(mValue[i] == 0) {
					mValue[i] = task.value;
					break;
				}
			}
		}
		long sum = Arrays.stream(mValue).sum();
		System.out.println(sum);
		sc.close();
	}

	class Task implements Comparable<Task> {
		public long value;
		public int day;
		public Task(int day, long value) {
			this.value = value;
			this.day = day;
		}
		@Override
		public int compareTo(Task o) {
			if(o.value == value) {
				return day - o.day;
			}
			return (int)(o.value - value);
		}

	}
}
