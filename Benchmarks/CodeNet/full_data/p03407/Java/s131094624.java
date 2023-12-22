import java.util.Scanner;

public class Sample1_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc1 = new Scanner(System.in);
		String line1 = sc1.nextLine();

		String[] inputText = line1.split(" ");

		int a = Integer.parseInt(inputText[0]) + Integer.parseInt(inputText[1]);
		int b = Integer.parseInt(inputText[2]);
		int c = a - b;

		if (c < 0) {
			System.out.print("No");
		} else {
			System.out.print("Yes");
		}
	}
}
