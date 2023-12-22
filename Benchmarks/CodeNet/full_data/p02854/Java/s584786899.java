import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long sum=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
			sum+=a[i];
		}
		long ans=Long.MAX_VALUE;
		long ss=0;
		for(int i=0; i<n; i++){
			ss+=a[i];
			ans=Math.min(ans,Math.abs(sum-2*ss));
		}
		System.out.println(ans);
	}
}
