import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());//int型
		int b = Integer.parseInt(sc.next());
		sc.close();
		int ans = 0;
		if (a>=b) {
			ans += a;
			a--;
		} else {
			ans += b;
			b--;
		}
		
		if (a>=b) {
			ans += a;
			a--;
		} else {
			ans += b;
			b--;
		}
		System.out.println(ans);
	}

}