import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		for(int i = N - 1 ;; i--) {
			if(check(S.substring(0, i))) {
				System.out.println(i);
				break;
			}
		}
	}

	public static boolean check(String S) {
		int N = S.length();
		if(N % 2 == 1) {
			return false;
		} else {
			return S.substring(0, N / 2).equals(S.substring(N / 2));
		}
	}
}
