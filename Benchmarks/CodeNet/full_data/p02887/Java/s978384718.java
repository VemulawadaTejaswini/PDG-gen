import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N, Sの入力
		int N = sc.nextInt();
		String S = sc.next();
		
		char[] Sarray = S.toCharArray();
		StringBuilder result = new StringBuilder();
		result.append(Sarray[0]);
		for (int i = 1; i < N; i++) {
			if (Sarray[i] != Sarray[i-1]) {
				result.append(Sarray[i]);
			}
		}
		
		// 結果の出力
		System.out.println(result.length());
		
		sc.close();
	}

}
