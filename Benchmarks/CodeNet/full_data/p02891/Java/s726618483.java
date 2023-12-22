import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long K = sc.nextLong();
		int count = 0;

		char c = ' ';
		//if (S.charAt(0) != S.charAt(S.length()-1)) {
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == c) {
					count++;
					i++;
				}
				if (i >= S.length())
					break;
				c = S.charAt(i);
			}
			long ans = count * K;
			System.out.println(K*count);
			//}
	}
}