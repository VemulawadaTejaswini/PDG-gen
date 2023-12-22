import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a > b) {
				long temp = b;
				b = a;
				a = temp;
			}
			long start = a*b-1;
			long base = start;
			int pair = 1;
			long ans = 0L;
			//System.out.println(start+" "+pair);
			while(start > 0) {
				if(start==a) {
					start--;
					continue;
				}
				if(pair==b) {
					pair++;
					continue;
				}
//				System.out.println(start+" "+pair);
				start = Math.min(base / ++pair, start-1);
				ans++;
			}
			System.out.println(ans);
		}
	}
}