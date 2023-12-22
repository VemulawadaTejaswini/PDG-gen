import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int res = 0;
		if (A==C && B==D ) res = D-C;
		else if (A<C && B<D && B>C) res = B-C;
		else if (A>C && B>D  && A<D) res = D-A;
		else if (A<C && B>D) res = D-C;
		System.out.println(res);
	}
}
