import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		
		long bar1 = 0;
		
		//1
		long ans1 = Long.MAX_VALUE;
		for(long i = 1; i < H; i++) {
			bar1 = i * W;
			long bar2 = ((H - i) / 2) * W;
			long bar3 = H * W - bar1 - bar2;
			long max = Math.max(bar1, Math.max(bar2, bar3));
			long min = Math.min(bar1, Math.min(bar2, bar3));
			ans1 = Math.min(ans1, max - min);
		}
		
		//2
		long ans2 = Long.MAX_VALUE;
		for(long i = 1; i < H; i++) {
			bar1 = i * W;
			long bar2 = (H - i) * (W / 2);
			long bar3 = H * W - bar1 - bar2;
			long max = Math.max(bar1, Math.max(bar2, bar3));
			long min = Math.min(bar1, Math.min(bar2, bar3));
			ans2 = Math.min(ans2, max - min);
		}
		
		//3
		long ans3 = Long.MAX_VALUE;
		for(long i = 1; i < W; i++) {
			bar1 = i * H;
			long bar2 = ((W - i) / 2) * H;
			long bar3 = H * W - bar1 - bar2;
			long max = Math.max(bar1, Math.max(bar2, bar3));
			long min = Math.min(bar1, Math.min(bar2, bar3));
			ans3 = Math.min(ans3, max - min);
		}
		
		//4
		long ans4 = Long.MAX_VALUE;
		for(long i = 1; i < W; i++) {
			bar1 = i * H;
			long bar2 = (W - i) * (H / 2);
			long bar3 = H * W - bar1 - bar2;
			long max = Math.max(bar1, Math.max(bar2, bar3));
			long min = Math.min(bar1, Math.min(bar2, bar3));
			ans4 = Math.min(ans4, max - min);
		}
		
		System.out.println(Math.min(ans1, Math.min(ans2, Math.min(ans3, ans4))));
	}
}
