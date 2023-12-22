import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}

		A[0] = A[1];

		sc.close();

		int answer = 0;

		for(int i = 0 ; i < N - 1 ;i ++) {
			answer = gcd(A[i], A[i+1]);
		}

		System.out.println(answer);
	}

	public static int gcd(int a, int b) {
		int tmp;
		if(b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if(a % b ==0) {
			return b;
		} else {
			return gcd(b, a%b);
		}
	}

}
