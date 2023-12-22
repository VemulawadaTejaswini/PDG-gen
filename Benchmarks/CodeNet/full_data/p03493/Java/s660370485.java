import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		String s = stdin.next();
		System.out.println(Character.getNumericValue(s.charAt(0))+Character.getNumericValue(s.charAt(1))+Character.getNumericValue(s.charAt(2)));
		

	}

}
