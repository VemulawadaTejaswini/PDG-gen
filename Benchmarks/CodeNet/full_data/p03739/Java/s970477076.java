import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<n;i++)a[i]=sc.nextLong();
		long sum=0;
		long count=0;
		for(int i=0;i<n-1;i++){
			sum+=a[i];
			if(sum>0){
				if(sum+a[i+1]>=0){
					count+=sum+a[i+1]+1;
					a[i+1]-=sum+a[i+1]+1;
				}
			}else if(sum<0){
				if(sum+a[i+1]<=0){
					count+=-1*(sum+a[i+1])+1;
					a[i+1]+=-1*(sum+a[i+1])+1;
				}
			}
		}
		System.out.println(count);
	}
}
	