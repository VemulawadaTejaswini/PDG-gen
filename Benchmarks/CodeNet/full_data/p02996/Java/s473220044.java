
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		List<Task> list = new ArrayList<>();
		for(long i = 0; i < n; i++) {
			list.add(new Task(sc.nextLong(), sc.nextLong()));
		}
		list.sort(Comparator.comparing(Task::getSime).reversed());
		boolean flag = true;
		long time = list.get(0).getSime();
		while(!list.isEmpty()) {
			Task tmp = list.get(0);
			time = Math.min(tmp.getSime(), time);
			time -= tmp.getSagyou();
			if(time < 0) {
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