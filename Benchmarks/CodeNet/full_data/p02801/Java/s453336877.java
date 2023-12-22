import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String moji = scan.nextLine();
		scan.close();
		char mojiChar = moji.charAt(0);
		char mojiCharNext = (char) ((char)mojiChar + 1);
		System.out.println(mojiCharNext);
	}

}
