import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long re = Main.count(A, B);
		int count =1;
		for (long i=2;i*i<=re;i++) {
			if (re%i==0) {
				while (re%i==0) {
					re/=i;
				}
				count ++;
			}
		}
		if (re>1) {
			count ++;
		}
		System.out.println(count);
	}

	public static long count(long A,long B) {
		if (A<B) {
			return count(B,A);
		}
		if (B==0) {
			return A;
		}
		return count(B,A%B);
	}
}