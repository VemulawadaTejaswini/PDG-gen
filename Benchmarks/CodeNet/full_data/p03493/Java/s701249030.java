import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String mass = sc.nextLine();

		int count = 0;

		for (int i = 0; i < mass.length(); i++) {
			if (mass.charAt(i) == '1') {
				count++;
			}
		}

		System.out.println(count);

	}

}