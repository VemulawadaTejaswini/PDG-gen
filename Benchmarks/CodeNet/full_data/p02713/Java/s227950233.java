import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				for (int k=1; k<=n; k++) {
					ans +=gcd3(i,j,k);
				}
			}
		}
		System.out.println(ans);
	}
	static int gcd3 (int a, int b, int c) {return gcd(gcd(a,b),c);}
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}
