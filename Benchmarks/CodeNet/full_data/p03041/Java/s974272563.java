import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		String s = S.substring(K-1, K);
		if (s.equals("A")) {
			s = "a";
		}else if (s.equals("B")) {
			s="b";
		}else {
			s="c";
		}

		System.out.println(S.substring(0,K-1)+s+S.substring(K,N));
	}
}
