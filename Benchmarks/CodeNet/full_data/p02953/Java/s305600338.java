import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		for(int i=n-1; i>0; i--){
			if(a[i-1]-a[i]>1){
				System.out.println("No");
				return;
			}
			if(a[i-1]-a[i]==1){
				a[i-1]--;
			}
		}
		System.out.println("Yes");
	}
}
