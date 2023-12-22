
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
		func2(n,tot,sum,ans);
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	// TLE
	public static void func(int n,long tot, long []sum, long []ans) {
 		for(int i=0;i<n;i++) {
			long x=0;
			for(int j=(i+1)%n;j!=i;j=(j+2)%n) {
				x+=sum[j];
			}
			ans[i]=tot-x;
		}
	}
	public static void func2(int n,long tot, long []sum, long []ans) {
		long x=0;
		for(int i=n-2;i>0;i-=2) {
			x+=sum[i];
		}
		long y=tot-x;
		ans[0]=y;
		long temp=ans[0];
		for(int i=0;i<n-1;i++) {
			ans[i+1]=sum[i]-temp;
			temp=ans[i+1];
		}
	}
}
