import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[]=new int[N];
		for (int i=0;i<N;i++) {
			a[i] =sc.nextInt();
		}
		int gcd =a[0];
		Main main = new Main();
		for (int i=1;i<N;i++) {
			gcd = main.gcd(gcd, a[i]);
		}
		System.out.println(gcd);
	}

	public int gcd(int a,int b) {
		if (b==0) {
			return a;
		} else {
			return gcd(b,a%b);
		}

	}
}