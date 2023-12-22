
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n+1];
		long tot=0;
		long []sum=new long[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			tot+=arr[i];
		}
		
		for(int i=0;i<n;i++) {
			sum[i]+=2*arr[i];

		}
		long []ans=new long[n+1];
		func(n,tot,sum,ans);
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	public static void func(int n,long tot, long []sum, long []ans) {
		//System.out.println(tot);
		for(int i=0;i<n;i++) {
			long x=0;
			for(int j=(i+1)%n;j!=i;j=(j+2)%n) {
				x+=sum[j];
				//System.out.println(i+" "+j+" "+sum[j]);
			}
			ans[i]=tot-x;
		}
	}
}
