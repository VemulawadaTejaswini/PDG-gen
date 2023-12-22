//Referred Professors code
import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] aa = new int[n];
		for (int i=0; i<n; i++)
			aa[i] = sc.nextInt();
		int gap = aa[0] + k - aa[n-1];
		for (int i = 1; i < n; i++)
			gap = Math.max(gap, aa[i]-aa[i-1]);
		System.out.println(k-gap);
	}
}