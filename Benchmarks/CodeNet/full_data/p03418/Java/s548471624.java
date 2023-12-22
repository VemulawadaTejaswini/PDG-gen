import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long ans=0;
		if(k==0){
			System.out.println(n*n);
			return;
		}
		for(long i=k+1; i<=n; i++){
			ans+=((n)/i)*(i-k);
			if((n%i)-k+1>0){
				ans+=(n%i)-k+1;
			}
		}
		System.out.println(ans);
	}
}