import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		long sum = 0;
		for (int a=1; a<=K; a++){
			for (int b=1; b<=K; b++){
				for (int c=1; c<=K; c++){
					sum += gcd(gcd(a,b),c);
				}
			}
		}
		System.out.println(sum);
	}

	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
}