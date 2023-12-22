import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] arr = new int[3 * N];

		SubArray sa1 = new SubArray(SubArray.ASC);
		SubArray sa2 = new SubArray(SubArray.DESC);

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sa1.add(arr[i]);
		}
		for (int i = N, M = 2 * N; i < M; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 2 * N, M = 3 * N; i < M; i++) {
			arr[i] = sc.nextInt();
			sa2.add(arr[i]);
		}

		long[] first = new long[N + 1];
		long[] second = new long[N + 1];

		for (int k = 0; k <= N; k++) {
			int j1 = N + k;
			int j2 = 2 * N - k - 1;

			first[k] = sa1.total;
			sa1.add(arr[j1]);
			sa1.removeTop();

			second[N - k] = sa2.total();
			sa2.add(arr[j2]);
			sa2.removeTop();
		}

		long score = first[0] - second[0];
		for (int i = 1; i <= N; i++) {
			score = Math.max(score, first[i] - second[i]);
		}
		System.out.println(score);
		sc.close();
	}

	class SubArray {
		public static final int ASC = 1;
		public static final int DESC = -1;
		private PriorityQueue<Integer> pq;
		private long total;

		public SubArray(int sortOrder) {
			total = 0;
			if (sortOrder == ASC) {
				pq = new PriorityQueue<Integer>();
			} else if (sortOrder == DESC) {
				pq = new PriorityQueue<>(new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2 - o1;
					}
				});
			} else {
				throw new IllegalArgumentException();
			}
		}

		public void add(int x) {
			this.pq.add(x);
			this.total += x;
		}

		public int removeTop() {
			int r = pq.poll();
			this.total -= r;
			return r;
		}

		public long total() {
			return this.total;
		}
	}

}
