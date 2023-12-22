import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {

			long n = sc.nextLong();
			long[] map = new long[5];
			for(int i=0; i<5; i++) {
				map[i] = sc.nextLong();
			}
			long max = 0;
			long ans = 0;
			for(int i=0; i<5; i++) {
				long now = n/map[i] + ((n%map[i]>0)? 1:0);
				ans += (now>max)? now - max : 0;
				max = Math.max(now, max);
			}
			System.out.println(ans+4);
		}
	}
}