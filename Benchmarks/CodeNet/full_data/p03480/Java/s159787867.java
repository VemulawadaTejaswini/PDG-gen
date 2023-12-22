import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int len = S.length();
		int K = len;

		for (int i=0; i<len-1; i++){
			if (S.charAt(i) != S.charAt(i+1)){
				int T = Math.max(i+1, len-(i+1));
				K = Math.min(K, T);
			}
		}
		System.out.println(K);
	}
}
