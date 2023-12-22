import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt(), B = scn.nextInt();

		int N = MyMath.gcd(A,B);
		int ans = 1;
		for(int i = 2;i <= N;i++) {
			if(N%i==0) {
				ans++;
				while(N%i==0) {
					N/=i;
				}
			}
		}
		System.out.println(ans);
	}
}
class MyMath{
	public static int gcd(int a,int b) {
		while(a%b!=0) {
			int buf = a%b;
			a = b;
			b = buf;
		}
		return b;
	}}

