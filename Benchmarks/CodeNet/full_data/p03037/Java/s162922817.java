import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int M = sc.nextInt();
		long Lx = 0;
		long Rx = N + 1;
		
		for(int i = 0; i < M; i++) {
			long l = sc.nextInt();
			long r = sc.nextInt();
			Lx = Math.max(Lx, l);
			Rx = Math.min(Rx, r);
		}
		
		long ans = Rx - Lx + 1;
		
		if(ans >= 0) {
			System.out.println(ans);
		} else {
			System.out.println(0);
		}
		
	}
}
