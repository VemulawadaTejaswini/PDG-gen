import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		String c = scan.next();
		char[] c1 = c.toCharArray();
		int ans = c1[0] + 1;
		
		System.out.print((char)ans);
	}

}
