import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long ans=0;
		if(k==0){
			System.out.println(n*n);
			return;
		}
		for(int i=k+1; i<=n; i++){
			ans+=((n)/i)*(i-k);
			if((n%i)-k+1>0){
				ans+=(n%i)-k+1;
			}
		}
		System.out.println(ans);
	}
}