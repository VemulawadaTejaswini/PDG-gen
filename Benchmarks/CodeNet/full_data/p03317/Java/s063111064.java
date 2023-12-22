import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for(int i=0;i<N;i++) sc.nextInt();
		
		System.out.println((N-1+K-2)/(K-1));
	}

	public static int gcd(int a, int b) {
		return a%b==0 ? b : gcd(b,a%b);
	}
}
