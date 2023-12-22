import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long sum=0;
		long ans=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			sum+=a[i]-n+1;
		}
		if(sum>0){
			long r=0;
			while(ans!=sum){
				sum--;
		long l=-1;
		r=Long.MAX_VALUE/10;
		while(r-l>1){
			long m=(l+r)/2;
			long count=0;
			for(int i=0; i<n; i++){
				count+=Math.max((a[i]-m+sum+n)/(n+1),0);
			}
			if(count<=sum){
				ans=count;
				r=m;
			}else{
				l=m;
			}
		}
			}
			for(int i=0; i<n; i++){
				a[i]=a[i]+sum-(n+1)*(Math.max((a[i]-r+sum+n)/(n+1),0));
			}
		}
		while(true){
			Arrays.sort(a);
			if(a[n-1]<=n-1){
				break;
			}else{
				a[n-1]-=n;
			}
			for(int i=n-2; i>=0; i--){
				a[i]++;
			}
			ans++;
		}
		System.out.println(ans);
	}
}
