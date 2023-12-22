import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long tmp = X;
		int res = 0;
		while (tmp <= Y) {
			tmp = tmp << 1;
			res++;
		}
		System.out.print(res);
	}
}
