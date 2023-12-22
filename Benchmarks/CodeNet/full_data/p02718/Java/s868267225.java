import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}
		
		Arrays.sort(a);
		
		if(a[n-m] >= (double)sum/(4*m)) System.out.println("Yes");
		else System.out.println("No");
	}
}