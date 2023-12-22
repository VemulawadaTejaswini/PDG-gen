import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		char start = S.charAt(K - 1);

		//N要素のビルダーを作成。
		StringBuilder sb = new StringBuilder(N);

		for(int i = 0 ; i < N ; i++) {
			char flg = S.charAt(i);
			if(flg == start) {
				sb.append(start);
			}else {
				sb.append('*');
			}
		}
		System.out.println(sb.toString());
	}
}