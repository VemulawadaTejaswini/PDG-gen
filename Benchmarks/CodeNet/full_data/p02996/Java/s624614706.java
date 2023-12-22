import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Work> works = new ArrayList<Work>();
		for (int i=0; i<n; i++) {
			works.add(new Main().new Work(sc.nextInt(), sc.nextInt()));
		}

		Collections.sort(works, new java.util.Comparator<Work>() {

			@Override
			public int compare(Work w1, Work w2) {
				if (w1.limit > w2.limit) {
					return 1;
				} else if (w1.limit == w2.limit) {
					return 0;
				} else {
					return 1;
				}
			}
		});

		works.sort((a,b)-> a.limit - b.limit);

		long sum = 0;
		boolean valid = true;
		for (Work work : works) {
			sum += work.time;
			if (work.limit < sum) {
				valid = false;
			}
		}

		System.out.println(valid ? "Yes" : "No");

	}

	class Work {
		int time;
		int limit;

		public Work(int time, int limit) {
			this.time = time;
			this.limit = limit;
		}
	}

}