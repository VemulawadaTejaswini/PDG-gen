import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		BoxesandCandies bc = new BoxesandCandies();
		bc.run();
	}
}

class BoxesandCandies {
	
	int N;
	long x;
	long[] nums;
	
	BoxesandCandies() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.x = cin.nextLong();
		this.nums = new long[N];
		for (int i = 0; i < N; i++) {
			nums[i] = cin.nextLong();
		}
	}
	
	void run() {
		long count = 0;
		long prev = nums[0];
		
		for (int i = 1; i < N; i++) {
			long next = nums[i];
			if (prev + next > x) {
				long sum = prev + next;
				long k = sum - x;
				count += k;
				nums[i] = Math.max(0, nums[i] - k);
			}
			prev = nums[i];
		}
		System.out.println(count);
	}
}
