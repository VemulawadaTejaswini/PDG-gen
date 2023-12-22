
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 0;

		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		String S = in.next();
		in.close();

		for (int i = 0; i < S.length() - 2; i++) {
			for (int j = i + 1; j < S.length() - 1; j++) {
//				System.out.println("i:"+i+", j:"+j);
				if(S.charAt(i) == S.charAt(j)) {
					continue;
				}
				for (int k = j + 1; k < S.length(); k++) {
					if (j - i == k - j || S.charAt(i) == S.charAt(k) || S.charAt(j) == S.charAt(k)) {
//						System.out.println("i:"+i+", j:"+j+", k:"+k);
						continue;
					}
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
