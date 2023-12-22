import java.util.Scanner;

public class Main {

	static Scanner sc;
	static String input;

	public static void main(String[] args) {
		//初期化
		init();

		String ans = "";
		//メインの処理
		switch(input) {
		case "A":
			ans = "T";
			break;
		case "T":
			ans = "A";
			break;
		case "G":
			ans = "C";
			break;
		case "C":
			ans = "G";
			break;
		}

		System.out.println(ans);

		sc.close();
	}

	private static void init() {
		sc = new Scanner(System.in);
		input = sc.nextLine();
	}
}