import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int aMax = 0;
//		int lcm = 1;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - 1;
			sum += a[i];
//			aMax = Math.max(aMax, a[i]);
//			lcm = lcm(lcm, a[i]);
		}

//		System.out.println(aMax);
//		System.out.println(lcm);

		int fMax = sum;
//		for (int m = 1; m <= lcm; m++) {
//			int f = 0;
//			for (int i = 0; i < N; i++) {
//				f += m % a[i];
//			}
//			fMax = Math.max(fMax, f);
//		}

		System.out.println(fMax);
	}
	
	static int lcm (int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (int)(c/b);
	}
}