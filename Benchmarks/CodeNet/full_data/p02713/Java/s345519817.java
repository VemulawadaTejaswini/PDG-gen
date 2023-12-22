import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int K=stdIn.nextInt();
		long ans=0;
		for(int i=1;i<=K;i++){
			for(int j=1;j<=K;j++){
				for(int k=1;k<=K;k++){
					ans+=gcd(i,gcd(j,k));
				}
			}
		}
		System.out.println(ans);
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
