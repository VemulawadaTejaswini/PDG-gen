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
		int[] n1 = new int[N];
		int[] n2 = new int[N];
		int[] n3 = new int[N];

		for (int i = 0; i < N; i++) {
			n1[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			n2[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			n3[i] = sc.nextInt();
		}

		SubArray first = new SubArray(n1, SubArray.SORT_ORDER.ASC);
		SubArray second = new SubArray(n3, SubArray.SORT_ORDER.DESC);

		int[] arr = n2;

		int f = 0;
		int l = N - 1;

		for (int i = 0; i < N; i++) {
			int s1 = arr[f] - first.peek();
			int s2 = second.peek() - arr[l];
			if (s1 < 0 && s2 < 0) {
				if(s1 <= s2) {
					f++;
				}else {
					l--;
				}
			} else if (s1 >= s2) {
				first.pop();
				first.push(arr[f]);
				f++;
			} else {
				second.pop();
				second.push(arr[l]);
				l--;
			}
		}
		assert(f>=l);

		System.out.println(first.total - second.total);
		sc.close();
	}

	static class SubArray {
		public enum SORT_ORDER {
			ASC, DESC
		}

		PriorityQueue<Integer> pq;
		public long total;

		public SubArray(int[] array, SORT_ORDER order) {
			int n = array.length;
			if (order == SORT_ORDER.ASC) {
				pq = new PriorityQueue<>(n);
			} else if (order == SORT_ORDER.DESC) {
				pq = new PriorityQueue<>(n, new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2 - o1;
					}
				});
			} else {
				throw new IllegalArgumentException();
			}

			total = 0;
			for (int i = 0; i < n; i++) {
				this.push(array[i]);
			}
		}

		public void push(int n) {
			pq.add(n);
			total += n;
		}

		public int pop() {
			int p = pq.poll();
			total -= p;
			return p;
		}

		public int peek() {
			return pq.peek();
		}
	}
}
