import java.util.Scanner;

public class Main {
	int L;
	long[] Ai = null;

	long[] totalLeftAi1 = null;
	long[] totalLeftAi2 = null;
	long[] totalRightAi2 = null;
	
	private void prepare() {
		Scanner in = new Scanner(System.in);
		L = in.nextInt();
		Ai = new long[L+1];
		for (int i=1; i<=L; i++) {
			Ai[i] = in.nextInt();
		}
		in.close();

		long totalLeftAi = 0;
		totalLeftAi1 = new long[L+1];
		totalLeftAi2 = new long[L+1];
		totalLeftAi1[0] = 0;
		totalLeftAi2[0] = 0;
		for (int i=1; i<=L; i++) {
			totalLeftAi += Ai[i];
			if (Ai[i] < 1) {
				totalLeftAi1[i] = totalLeftAi1[i-1] + (1 - Ai[i]);
			} else {
				totalLeftAi1[i] = totalLeftAi1[i-1] + (Ai[i] + 1) % 2;
			}
			if (Ai[i] < 2) {
				totalLeftAi2[i] = totalLeftAi2[i-1] + (2 - Ai[i]);
			} else {
				totalLeftAi2[i] = totalLeftAi2[i-1] + (Ai[i] % 2);
			}
			if (totalLeftAi2[i] > totalLeftAi) {
				totalLeftAi2[i] = totalLeftAi;
			}
		}
		
		long totalRightAi = 0;
		totalRightAi2 = new long[L+2];
		totalRightAi2[L+1] = 0;
		
		for (int i=L; i>=1; i--) {
			totalRightAi += Ai[i];
			if (Ai[i] < 2) {
				totalRightAi2[i] = totalRightAi2[i+1] + (2 - Ai[i]);
			} else {
				totalRightAi2[i] = totalRightAi2[i+1] + (Ai[i] % 2);
			}
			if (totalRightAi2[i] > totalRightAi) {
				totalRightAi2[i] = totalRightAi;
			}
		}
		
	}
	
	public long getCount(int left, int right) {
		return totalLeftAi2[left-1]
				+ totalLeftAi1[right]
				- totalLeftAi1[left]
				+ totalRightAi2[right+1];
	}
	
	public long solve() {
		prepare();
		long min = Long.MAX_VALUE;
		
		for (int i=1; i<=L; i++) {
			for (int j=i; j<=L; j++) {
				long count = getCount(i, j);
				if (min > count) {
					min = count;
					
					//System.out.println(left + "," + right + " : " + count);
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.solve());
	}
}