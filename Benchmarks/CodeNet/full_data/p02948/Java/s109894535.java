
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
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
		List<Task> taskList = new LinkedList<>();
		for(int i = 0 ; i < n ; i++) {
			taskList.add(new Task(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(taskList);
		long value = 0;
		for(int i = 1 ; i <= m ; i++) {
			if(!taskList.isEmpty()) {
				for(Iterator<Task> taskIte = taskList.iterator();taskIte.hasNext();) {
					Task task = taskIte.next();
					if(task.day <= i) {
						value += task.value;
						taskIte.remove();
						break;
					}
				}
			}
		}
		System.out.println(value);
		sc.close();
	}

	class Task implements Comparable<Task> {
		public int value;
		public int day;
		public Task(int day, int value) {
			this.value = value;
			this.day = day;
		}
		@Override
		public int compareTo(Task o) {
			if(o.value == value) {
				return day - o.day;
			}
			return o.value - value;
		}

	}
}
