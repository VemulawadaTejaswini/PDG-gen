import java.util.Scanner;

public class Main {

	public static final char LEFT = 'L';
	public static final char RIGHT = 'R';
	public static final char UP = 'U';
	public static final char DOWN = 'D';

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		char[] str = scan.next().toCharArray();

		//出力値
		String result = "Yes";

		int length = str.length;

		for (int i = 0; i < length; i++) {
			if ((i + 1) % 2 == 0 && str[i] == (RIGHT)) {
				result = "No";
			} else if ((i + 1) % 2 == 1 && str[i] == (LEFT)) {
				result = "No";
			}
		}

		System.out.println(result);
	}
}