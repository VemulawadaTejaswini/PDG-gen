import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		for(int i=0;i<=S.length();i++) {
			if(T.equals(S)) {
				System.out.println("Yes");
				return;
			}
			S = rotate(S);
		}
		System.out.println("No");
	}
	static String rotate(String str) {
		StringBuilder ans = new StringBuilder(str);
		ans.insert(0,ans.charAt(ans.length()-1));
		ans.deleteCharAt(ans.length()-1);
		return ans.toString();
	}
}
