import java.util.Arrays;
import java.util.Scanner;

public class MainchanC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,X;

		n=sc.nextInt();
		X=sc.nextInt();

		int[] x = new int[n+1];


		for(int k=1;k<=n;k++) {
			x[k]=sc.nextInt();
		}
		x[0]=X;
		Arrays.sort(x);

		int min=Integer.MAX_VALUE;

		for(int k=1;k<=n;k++) {
			min=Math.min(min,x[k]-x[k-1]);
		}

		System.out.println(min);
	}
}
