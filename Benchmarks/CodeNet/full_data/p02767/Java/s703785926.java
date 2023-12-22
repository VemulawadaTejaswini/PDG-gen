
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x[]=new int[n];
		double c=0;
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			c+=x[i];
		}
		Arrays.sort(x);
		int d=0;
		System.out.println(c);

		c=Math.round(c/n);
		System.out.println(c);

		for(int i=0;i<n;i++) {
			d+=Math.pow(x[i]-c,2);
		}
		System.out.println(d);
	}

}
