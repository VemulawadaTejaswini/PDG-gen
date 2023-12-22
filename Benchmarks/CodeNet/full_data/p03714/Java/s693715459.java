import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long left[]=new long[N+1];
		long center[]=new long[N+1];
		long right[]=new long[N+1];
		
		for(int i=1;i<=N;i++) {
			left[i]=sc.nextLong();
		}
		for(int i=1;i<=N;i++) {
			center[i]=sc.nextLong();
		}
		for(int i=1;i<=N;i++) {
			right[i]=sc.nextLong();
		}
		Arrays.sort(left);
		Arrays.sort(right);
		
		int l=0;
		int r=0;
		long s=Long.MIN_VALUE;
		for(int i=0;i<=N;i++) {
			l=0;r=0;
			for(int j=N;j>i;j--) {
				l+=left[j];
				r+=center[j];
			}
			for(int j=1;j<=i;j++) {
				l+=center[j];
				r+=right[j];
			}
			s=Math.max(s,l-r);
		}
		System.out.println(s);
	}
}
