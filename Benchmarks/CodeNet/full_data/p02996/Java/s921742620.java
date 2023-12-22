import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Work[] works = new Work[n];
		for (int i = 0; i < n; i++) {
			works[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(works, new Comparator<Work>() {
		public int compare(Work w1, Work w2) {
			return w1.end - w2.end;
		}
		});
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += works[i].time;
			if (total > works[i].end) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	
	static class Work {
		int time;
		int end;
		
		public Work(int time, int end) {
			this.time = time;
			this.end = end;
		}
	}
}
