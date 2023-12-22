import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) a[i]=sc.nextLong()-i;
		Arrays.sort(a); long sum=0;
		for(int i=1;i<=n;i++)sum+=Math.abs(a[i-1]-a[(n/2)]);
		System.out.println(sum);
	}
}
