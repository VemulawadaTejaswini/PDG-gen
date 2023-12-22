import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// シミュレーション
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean[] news = new boolean[4];
		for (int i = 0; i < S.length(); i++) {
			char here = S.charAt(i);
			switch (here) {

			case 'N':
				news[0] = true;
				continue;
			case 'E':
				news[1] = true;
				continue;
			case 'W':
				news[2] = true;
				continue;
			case 'S':
				news[3] = true;
				continue;
			}
		}

		String ans = "No";
		if(news[0] && news[3]) {
			if(news[1] && news[2]) {
				ans = "Yes";
			}else if(!news[1] && !news[2]) {
				ans = "Yes";
			}
		}
		if(news[1] && news[2]) {
			if(news[0] && news[3]) {
				ans = "Yes";
			}else if(!news[0] && !news[3]) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}

}
