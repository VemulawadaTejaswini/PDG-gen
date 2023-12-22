import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		String S;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		S = sc.next();

		String s[] = new String[N+1];
		int i;
		for (i = 0; i < N; i++) {
			s[i] = String.valueOf(S.charAt(i));
		}
		s[N] = "0";
		int hash = 0;
		int dot = 0;
		int count = 0;
		for (i = 0; i <= N; i++) {
			if (s[i].equals("#") && dot == 0) {
				hash++;
			} else if (s[i].equals(".") && hash != 0) {
				dot++;
			} else if (hash != 0 || i == N) {
				if (hash >= dot)
					count += dot;
				else
					count += hash;
				hash = 1;
				dot = 0;
			}
		}
		System.out.println(count);
	}

}