import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			String S = sc.next();
			int K = Integer.parseInt(sc.next());
			StringBuilder sb = new StringBuilder();
			char c = S.charAt(K -1);
			for(char cc : S.toCharArray()) {
				if(cc == c) {
					sb.append(cc);
				} else {
					sb.append('*');
				}
			}
			System.out.println(sb.toString());
		} // Scanner Close
	}
}