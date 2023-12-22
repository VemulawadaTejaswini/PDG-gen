import java.util.Scanner;

public class Main {// AtCoderは必ずMainクラスで提出する
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		char hoge = 'a';
		char[] s = S.toCharArray();
		for(int i = 0 ;i < S.length();i++) {
			if(S.equals(T)) {
				System.out.println("Yes");
				break;
			}
			for(int j =0 ;j < S.length()-1;j++) {
				hoge = s[0];
				s[j] = s[j+1];
			}
			s[s.length-1] = hoge;
		}
		System.out.println("No");
	}
}
