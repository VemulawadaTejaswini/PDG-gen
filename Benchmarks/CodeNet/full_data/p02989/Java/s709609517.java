import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] d = new int[n];
		int i;
		for(i = 0; i < n; i++) {
			d[i] = scan.nextInt();
		}
		Arrays.sort(d);

		int low = n / 2 - 1;
		int hi = n / 2;

		int ans;
		if(d[low] == d[hi]) {
			ans = 0;
		}else {
			ans = d[hi] - d[low];
		}
		System.out.println(ans);
	}
}