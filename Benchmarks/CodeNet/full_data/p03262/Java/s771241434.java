import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		for (int i=0;i<=N;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int B[] = new int[N];
		for (int i=0;i<N;i++) {
			B[i] =A[i+1]-A[i];
		}
		int max =B[0];
		for (int i=0;i<N-1;i++) {
			max =Main.gcd(B[i+1],max);
		}
		System.out.println(max);
	}
	public static int gcd(int a,int b) {
		if (a<b) {
			return gcd(b,a);
		}
		if (b==0) {
			return a;
		}
		return gcd(a%b,b);
	}
}