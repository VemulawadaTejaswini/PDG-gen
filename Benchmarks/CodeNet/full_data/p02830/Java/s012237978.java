import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		String T = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++) {
			char tmpS = S.charAt(i);
			sb.append(tmpS);
			char tmpT = T.charAt(i);
			sb.append(tmpT);
		}
		String ans = sb.toString();
		System.out.println(ans);

	}

}