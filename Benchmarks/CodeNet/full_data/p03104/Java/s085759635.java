import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		String a = String.format("%42s", Long.toBinaryString(A)).replace(" ", "0");
		String b = String.format("%42s", Long.toBinaryString(B)).replace(" ", "0");
		//System.out.println(a);
		//System.out.println(b);
		int l = Long.toBinaryString(B).length();
		long[] k = new long[42];
		k[0] = 1;
		for(int i = 1; i < 42; i++) {
			k[i] = k[i - 1] * 2;
		}
		long e = B - A;
		long ans = 0;

		long t = A ^ B;
		long f = A & B;
//		if(e % 2 == 0) {
//			System.out.println(t);
//		}else {
//			System.out.println(f);
//		}
		//System.out.println(t);
		if(f == 0) {
			System.out.println(t - 1);
		}else {
			System.out.println(Math.max(f, t));
		}
	}
}