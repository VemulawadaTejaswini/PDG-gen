import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		String[] array = s.split("");
		int ans = 0;
		int tmp = 0;

		for(int i = 0;i<s.length();i++) {
			if(array[i].equals("W")) {
				ans = ans + tmp;
			}else {
				tmp = tmp+1;

			}
		}

		System.out.println(ans);
	}
}
