import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		long m=0;
		long ans=0;
		long sum=0;
		long j=1000000000;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			sum+=a[i];
			if(a[i]>b[i]){
				j=Math.min(j,b[i]);
			}
		}
		if(j==1000000000){
			System.out.println(0);
		}else{
			System.out.println(sum-j);
		}
	}
}
