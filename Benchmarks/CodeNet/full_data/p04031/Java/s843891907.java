import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		BeTogether together = new BeTogether();
		together.run();
	}
}

class BeTogether {
	
	int N;
	int[] nums;
	
	BeTogether() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = cin.nextInt();
		}
	}
	
	void run() {
		int avarage = calculateAvarage();
		int min = 0;
		for (int i = 0; i < N; i++) {
			min += (nums[i] - avarage) * (nums[i] - avarage);
		}
		System.out.println(min);
	}
	
	int calculateAvarage() {
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += nums[i];
		}
		return (int)Math.round(sum / nums.length);
	}
}
