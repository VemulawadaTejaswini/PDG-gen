
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String line = sc.nextLine();
		String num = "0";
		if (line.equals("SUN")) {
			num = "7";
		} else if (line.equals("MON")) {
			num = "6";
		} else if (line.equals("TUE")) {
			num = "5";
		} else if (line.equals("WED")) {
			num = "4";
		} else if (line.equals("THU")) {
			num = "3";
		} else if (line.equals("FRI")) {
			num = "2";
		} else {
			num = "1";
		}

		// 出力
		System.out.println(num);
	}
}