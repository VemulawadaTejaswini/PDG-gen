import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long a[]=new long[k+1];
		for(int i=1;i<=k;i++) {
		a[i]=sc.nextLong();
		}
		long n[]=new long[k+1];
		long N[]=new long[k+1];
		n[k]=2;
		N[k]=2;
		for(int i=k;i>0;i--) {
			n[i-1]=Math.max(n[i],(n[i]+a[i]-1)/a[i]*a[i]);
			N[i-1]=N[i]/a[i]*a[i]+a[i]-1;
					}
		if(N[0]<n[0])	System.out.println(-1);
		else	System.out.println(n[0]+" "+N[0]);

	}
}
