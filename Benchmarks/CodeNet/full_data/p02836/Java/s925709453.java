import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		String str = sca.next();

		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				result++;
			}
		}
		System.out.println(result/2);
	}
}
