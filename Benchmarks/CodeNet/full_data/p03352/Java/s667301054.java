
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//  1 <= x <= 1000
		int x = scanner.nextInt();
		int ans = 0;
		ans = exponential(x);
		System.out.println(ans);
		
	}
	
	public static int exponential(int x) {
		int ans = 0;
		for (int i = 31; i >= 1; i--) {
			for (int j = 9; j >= 2; j--) {
				if (Math.pow((double)i, (double)j) <= x) {
					ans = Math.max(ans, (int)Math.pow((double)i, (double)j));
//					System.out.println(i + "," + j);
				}
			}
		}
		return ans;
	}

}
