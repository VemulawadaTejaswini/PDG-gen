import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		long ans=1;
		if(n%2==0){
			for(int i=0;i<n-1;i+=2){
				if(a[i]==i+1 && a[i+1]==i+1){}
				else{
					System.out.println(0);
					return;
				}
			}
			for(int i=0;i<n/2;i++){
				ans*=2;
				ans%=(1000000000+7);
			}
			System.out.println(ans);
		}else{
			for(int i=1;i<n-1;i+=2){
				if(a[0]==0){}
				else System.out.println(0);
				
				if(a[i]==i+1 && a[i+1]==i+1){}
				else{
					System.out.println(0);
					return;
				}
			}
			for(int i=0;i<n/2;i++){
				ans*=2;
				ans%=(1000000000+7);
			}
			System.out.println(ans);
		}
	}
}
