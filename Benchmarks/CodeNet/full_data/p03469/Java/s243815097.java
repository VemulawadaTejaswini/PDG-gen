import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(3,'8');
		System.out.println(sb.toString());

	}

}
