import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q =sc.nextInt();
		long[] a=new long[n+1];
		long[] sum=new long[n+1];
		long[] sum2=new long[n+1];
		for(int i=1; i<=n; i++){
			a[i]=sc.nextLong();
			sum[i]=sum[i-1]+a[i];
			if(i%2==0){
				sum2[i]=a[i]+sum2[i-1];
			}else{
				sum2[i]=sum2[i-1];
			}
		}
		int right=0;
		int left=0;
		for(int i=0; i<q; i++){
			right=-1;
			left=(n-1)/2;
			long x=sc.nextLong();
			while(left-right>1){
				int mid=(right+left)/2;
				if(Math.abs(x-a[n-mid])<Math.abs(x-a[n-mid*2])){
					left=mid;
				}else{
					right=mid;
				}
			}
			long two=0;
			if(n%2==0){
				two=sum2[n-2*left];
			}else{
				two=sum[n-2*left]-sum2[n-2*left];
			}
			System.out.println(sum[n]-sum[n-left]+two+" "+left);
		}
	}
}
