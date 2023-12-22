import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);
		Long ans = (long) 0;

		int N = sc.nextInt();
		String S[] = new String[N];
		char SWK[] = new char[11];

		sc.nextLine();
		for(int i=0; i<N; i++) {
			SWK = sc.nextLine().toCharArray();
			Arrays.sort(SWK);
			S[i] = new String(SWK);

		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(S[j].equals(S[i])) {
					ans++;
				}
			}
		}

		System.out.println(ans);

		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}