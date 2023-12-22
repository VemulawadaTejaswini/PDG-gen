import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = str.split("");

		for (int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals("B")) {

				if(i != 0) {
					strArray[i - 1] = "";
				}
				strArray[i] = "";

			}
		}

		for (String str_ : strArray) {

			System.out.print(str_);
		}
	}

}
