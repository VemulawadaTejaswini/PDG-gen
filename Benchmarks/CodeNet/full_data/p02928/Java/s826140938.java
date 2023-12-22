import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	private void compute() {
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int[] nums = new int[2000];
		
		long cnt = 0;
		
		for (int i=0;i<N;i++) {
			int num = scan.nextInt();
			nums[num-1]++;
			for (int j=num;j<2000;j++) {
				cnt += nums[j];
			}
		}
		
		long cnt2 = 0;
		int remain = N;
		
		for (int i=2000-1;i>=0;i--) {
			remain -= nums[i];
			cnt2 += remain * nums[i];
		}
		
		long ans = (cnt+0l) * K + cnt2 * ((K-1l) * K / 2l % 1000000007l);
		ans %= 1000000007l;
		
		System.out.println(ans);
	}
	
	public static void main(String...arg) {
		new Main().compute();
	}

}
