
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "", str3 = "";

		str1 = sc.nextLine();

		str2 = sc.nextLine();
		str3 = sc.nextLine();

		System.out.println(str1.substring(0, 1).toUpperCase()
				+ str2.substring(0, 1).toUpperCase()
				+ str3.substring(0, 1).toUpperCase());
	}

}
