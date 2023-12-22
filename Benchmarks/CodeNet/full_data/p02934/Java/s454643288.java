import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int numerator = 1;
		int denominator = 0;
		double ans;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			System.out.println(A[i]);
			numerator *= A[i];
		}
		for(int i=0;i<N;i++) {
			denominator += numerator/A[i];
		}
		ans = (double)numerator/denominator;
		System.out.println(ans);
	}
}
