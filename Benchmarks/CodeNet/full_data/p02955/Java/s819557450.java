import java.util.Scanner;
import java.util.Arrays;
public class Main{
	static int[] a;
	static int n;
	static int k;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[n];
		long sum=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		long ans=1;
		for(int i=1; i*i<=sum; i++){
			if(sum%i==0){
				ans=Math.max(ans,ch(i));
				ans=Math.max(ans,ch(sum/i));
			}
		}
		System.out.println(ans);
	}
	public static long ch(long t){
		long[] ar=new long[n+1];
		for(int i=1; i<=n; i++){
			ar[i]=a[i-1]%t;
		}
		Arrays.sort(ar);
		for(int i=2; i<=n; i++){
			ar[i]+=ar[i-1];
		}
		int q=(int)(ar[n]/t);
		if(ar[n-q]<=k){
			return t;
		}else{
			return 1;
		}
	}
}
