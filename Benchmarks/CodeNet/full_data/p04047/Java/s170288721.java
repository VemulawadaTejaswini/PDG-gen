import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int ans = 0;
			int [] a = new int [205];
			int n = cin.nextInt();
			for(int i = 0; i < 2 * n; i ++)
				a[i] = cin.nextInt();
			Arrays.sort(a, 0, 2 * n);
			for(int i = 2 * n - 1; i >= 0; i -= 2)
				ans += a[i - 1];
			System.out.println(ans);
		}
		
	}
}