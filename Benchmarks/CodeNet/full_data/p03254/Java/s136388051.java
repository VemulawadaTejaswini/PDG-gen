import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int n=sc.nextInt();
		int x=sc.nextInt();
		Integer[] candies = new Integer[n];
		for (int i=0;i<n;i++) {
			candies[i] =sc.nextInt();
		}
		Arrays.sort(candies);
		int ans =0;
		for (int i=0;i<n;i++) {
			if(x>=candies[i]) {
				x -= candies[i];
				ans ++;
			}
		}
		if (x>0) {
			ans--;
		}
		System.out.println(ans);

//------------------------------------------------------------
	}
}