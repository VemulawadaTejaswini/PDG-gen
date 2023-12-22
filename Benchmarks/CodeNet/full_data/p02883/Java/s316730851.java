import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		int[] a=new int[n];
		int[] f=new int[n];
		for(int i=0;i<n; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++){
			f[i]=sc.nextInt();
		}
		Arrays.sort(f);
		long left=-1;
		long right=1000000000000L;
		while(right-left>1){
			long mid=(right+left)/2;
			long count=k;
			for(int i=0; i<n; i++){
				long cost=a[i]*f[n-i-1];
				if(cost>mid){
					count-=a[i]-(mid/f[n-i-1]);
				}
			}
			if(count<0){
				left=mid;
			}else{
				right=mid;
			}
		}
		System.out.println(right);
	}
}
