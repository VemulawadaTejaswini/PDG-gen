import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		char[] son = { 'K', 'I', 'H', 'B', 'R' };
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.indexOf("KIH") == -1){
			System.out.println("NO");
			return;
		}

		for (char c : s.toCharArray()) {
			
			char[] cTmp = {c , c};
			String tmp = new String(cTmp);
			
			if(s.indexOf(tmp) != -1){//連続した重複が存在する
				System.out.println("NO");
				return;
			}

			if( c == 'A'){
				continue;
			}

			if (cnt >= son.length - 1) {// 文字列超過
				System.out.println("NO");
				return;
			}

			if (c == son[cnt]) {// 正しい子音と一致
				if (c == 'R') {// 最後の子音
					if (s.indexOf(c) == s.length() - 1) {// R以後に文字がない
						System.out.println("YES");
						return;
					} else if(s.lastIndexOf("RA") == s.length() -2 ){//Rの次がA
						System.out.println("YES");
						return;
					}else{
						System.out.println("NO");
						return;
					}

				}
				++cnt;
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
