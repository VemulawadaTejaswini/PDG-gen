import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long mod=1000000007;
		long xsum=0;
		long ysum=0;
		for(long i = 0; i<n; i++){
			xsum+=(sc.nextLong())*(2*i-n+1);
			xsum%=mod;
		}
		for(long i = 0; i<m; i++){
			ysum+=(sc.nextLong())*(2*i-m+1);
			ysum%=mod;
		}
		System.out.println((xsum*ysum)%mod);
	}
}
