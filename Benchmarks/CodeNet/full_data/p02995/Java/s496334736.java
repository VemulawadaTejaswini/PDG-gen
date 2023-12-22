import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long A = sc.nextLong();
		long B = sc.nextLong();
		int C = sc.nextInt();
		int D = sc.nextInt();

		long a =C,b=D;
		long x = a * b;
		long tmp,r;
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		long min = x/b;
		System.out.println(B-A-(countup(A,B,C)+countup(A,B,D)-countup(A,B,min))+1);

	}
	static long countup(long A,long B,long n) {
		return countup(B,n)-countup(A,n)+(A%n==0?1:0);
	}
	static long countup(long A,long n) {
		return A/n;
	}
}