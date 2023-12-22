
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		List<Task> list = new ArrayList<>();
		boolean flag = true;
		long max = 0;
		long count = 0;
		for(long i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			list.add(new Task(a, b));
			count += a;
			max = Math.max(max, b);
			if(count > max) {
				flag = false;
				break;
			}
		}
		list.sort(Comparator.comparing(Task::getSime));

		if(flag) {
			long time = 0;
			while(!list.isEmpty()) {
				Task tmp = list.get(0);
				time += tmp.getSagyou();
				if(time > tmp.getSime()) {
					flag = false;
					break;
				}
				list.remove(0);
			}
			if(flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}

}

class Task {
	private long sagyou;
	private long sime;

	protected Task(long sagyou, long sime) {
		super();
		this.sagyou = sagyou;
		this.sime = sime;
	}

	public long getSagyou() {
		return sagyou;
	}

	public void setSagyou(long sagyou) {
		this.sagyou = sagyou;
	}

	public long getSime() {
		return sime;
	}

	public void setSime(long sime) {
		this.sime = sime;
	}

}