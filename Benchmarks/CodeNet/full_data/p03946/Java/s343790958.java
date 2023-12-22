import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		AnInvisibleHand hand = new AnInvisibleHand();
		hand.run();
	}
}

class AnInvisibleHand {
	
	int N;
	long T;
	long[] prices;
	
	AnInvisibleHand() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.T = cin.nextInt();
		this.prices = new long[N];
		for (int i = 0; i < N; i++) {
			prices[i] = cin.nextLong();
		}
	}
	
	void run() {
		
		int[] maxIds = new int[N];
		long maxValue = 0; 
		int maxId = N - 1;
		for (int i = N - 1; i >= 0; i--) {
			if (maxValue < prices[i]) {
				maxId = i;
			}
			maxValue = Math.max(maxValue, prices[i]);
			maxIds[i] = maxId;
		}
		
		long maxValueInAll = 0;
		LinkedList<Long> maxList = new LinkedList<Long>();
		for (int i = 0; i < N; i++) {
			int j = maxIds[i];
			long maxIJ = prices[j] - prices[i];
			maxList.add(maxIJ);
			maxValueInAll = Math.max(maxValueInAll, maxIJ);
		}
		
		int count = 0;
		for (long max: maxList) {
			if (max == maxValueInAll)
				count++;
		}
		
		System.out.println(count);
	}
}
