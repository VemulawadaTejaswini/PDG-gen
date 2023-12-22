import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		int N = S.length();
		
		String firstHalf = S.substring(0, (N-1)/2);
		String secondHalf = S.substring((N+3)/2 - 1);
		
		// 結果の出力
		if (isPalindrome(S) && isPalindrome(firstHalf) && isPalindrome(secondHalf)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}		

		sc.close();
	}
	
	static boolean isPalindrome (String s) {
		int n = s.length();
		for (int i=0; i<n/2; i++) {
			if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
		}
		return true;
	}
}
