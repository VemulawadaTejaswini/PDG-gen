import java.util.HashMap;
import java.util.Scanner;

public class Main {
	// arc074 D
	
	private class Status implements Comparable<Status> {
		public int left = 0;
		public int start = 0;
		
		public Status(int left, int start) {
			this.left = left;
			this.start = start;
		}

		@Override
		public int compareTo(Status o) {
			int diff = this.left - o.left;
			if (diff == 0) {
				return 0;
			}
			return this.start - o.start;
		}
		
		@Override
		public int hashCode() {
			return (this.left << 15) | this.start;
		}
	}
	
	int N = 0;
	HashMap<Status, Long> results = new HashMap<Status, Long>();
	int[] nums = null;

	public long solveSub(int left, int start, int picked) {
		Status status = new Status(left, start);
		Long ret = results.get(status);
		if (ret != null) {
			return ret;
		}

		if (N*3-start < left) {
			return Long.MIN_VALUE;
		}

		if (left <= 0) {
			long sum = 0;
			for (; start < 3*N; start++) {
				if (picked < N) {
					sum += nums[start];
				} else {
					sum -= nums[start];
				}
				picked++;
			}
			results.put(status, sum);
			return sum;
		}
		
		// non-remove, pick-up
		long nonRemoveResult = solveSub(left, start+1, picked+1);
		if (nonRemoveResult != Long.MIN_VALUE) {
			if (picked < N) {
				nonRemoveResult += nums[start];
			} else {
				nonRemoveResult -= nums[start];
			}
		}
		
		// removed, no pick-up
		long removedResult = solveSub(left-1, start+1, picked);
		
		long result = Math.max(nonRemoveResult, removedResult);
		results.put(status, result);
		
		return result;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		
		nums = new int[3*N];
		for (int i=0; i<3*N; i++) {
			nums[i] = in.nextInt();
		}
		in.close();

		long result = solveSub(N, 0, 0);

		System.out.println(result);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
