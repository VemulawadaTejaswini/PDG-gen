import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int[] x= {0,0};
		int t=0;
		for(int i=n-1;i>=0;i--) {
			x[t]+=a[i];
			t=1-t;
		}
		System.out.println(x[0]-x[1]);

		}
}
