import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int ans = 0;
		
		for(int i = 1; i <= M; i++) {
			for(int y = 22; y <= D; y++) {
				int d1 = y / 10;
				int d10 = y % 10;
				if(i == d1 * d10 && d1 >= 2 && d10 >= 2) {
					ans += 1;
				}
			}
		}
		System.out.println(ans);
	}
}
