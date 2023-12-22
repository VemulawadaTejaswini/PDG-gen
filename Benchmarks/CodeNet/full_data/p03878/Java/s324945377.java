import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		long mod=1000000007;
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		for(int i=0; i<n; i++){
			b[i]=sc.nextLong();
		}
		int oa=0;
		int ob=0;
		int ca=0;
		int cb=0;
		long ans=1;
		for(int i=0; i<2*n; i++){
			if(a[oa]<b[ob]){
				if(oa==n-1){
					oa=0;
					a[oa]=Long.MAX_VALUE;
				}else{
					ca++;
					oa++;
				}
			}else{
				if(ob==n-1){
					ob=0;
					a[ob]=0;
				}else{
					cb++;
					ob++;
				}
			}
			if(ca==cb){
				long p=1;
				while(ca>0){
					p*=ca;
					ca--;
					p%=mod;
				}
				ans*=p;
				ans%=mod;
				ca=0;
				cb=0;
			}
		}
		System.out.println(ans);
	}
}
