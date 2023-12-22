import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static long r,a,b,ans;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		n=sc.nextInt();
		long A[]=new long[n];
		for(int i=0;i<n;i++)A[i]=sc.nextLong();
		Arrays.sort(A);
		ans=0;
		b=A[0];
		for(int i=1;i<n;i++) {
			long temp=gcd(A[i],b);
			if(ans<temp)ans=temp;
		}
		System.out.println(ans);
		}
	public static long gcd(long a,long b) {
		while ((r = a % b) != 0) {
			a = b;
			b = r;
			}
		return b;
	}
}
