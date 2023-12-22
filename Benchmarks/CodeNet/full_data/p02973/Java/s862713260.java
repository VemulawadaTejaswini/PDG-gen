import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Integer[] A = new Integer[N];
		for (int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		// List<Integer> A_list = Arrays.asList(A);
		// Collections.reverse(A_list);
		// Integer[] A_2 = (Integer[])A_list.toArray(new Integer[N]);
		// System.out.println(LIS(A_2));
		System.out.println(LDS(A));
	}

	public static int LIS(Integer[] A) {
		int N = A.length;
		int max = 0;
		int[] max_cnt = new int[N];
		for (int i=0;i<N;i++) {
			int max_value = 0;
			for (int j=i;j<N;j++) {
				if (A[j] >= max_value) {
					max_cnt[i]++;
					max_value = A[j];
					max = Math.max(max, max_cnt[i]);
				}
			}
		}
		return max;
	}

	public static int LDS(Integer[] A) {
		int N = A.length;
		int max = 0;
		int[] max_cnt = new int[N];
		for (int i=0;i<N;i++) {
			int min_value = Integer.MAX_VALUE;
			for (int j=i;j<N;j++) {
				if (A[j] <= min_value) {
					max_cnt[i]++;
					min_value = A[j];
					max = Math.max(max, max_cnt[i]);
				}
			}
		}
		return max;
	}
}