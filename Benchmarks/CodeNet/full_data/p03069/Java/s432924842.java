
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		String s =stdin.next();
		boolean b = false;
		int cnt = 0;
		char[] c = s.toCharArray();
		for(int i = 0;i<n;i++) {
			if(c[i]=='#') {
				b=true;
			}
			if(c[i]=='.'&&b) {
				cnt++;
			}
		}
		System.out.println(cnt);

		


	}

}
