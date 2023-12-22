
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<n-1;i++){
			sum+=a[i];
			if(sum>0){
				while(sum+a[i+1]>=0){
					a[i+1]--;
					count++;
				}
			}else if(sum<0){
				while(sum+a[i+1]<=0){
					a[i+1]++;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
	