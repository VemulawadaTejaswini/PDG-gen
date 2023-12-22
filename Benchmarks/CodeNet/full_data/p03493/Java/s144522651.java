import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int counter = 0;

		String temp = scanner.nextLine();
		if(String.valueOf(temp.charAt(0)).equals("1")) {
			counter++;
		}
		if(String.valueOf(temp.charAt(1)).equals("1")) {
			counter++;
		}
		if(String.valueOf(temp.charAt(2)).equals("1")) {
			counter++;
		}

		System.out.println(counter);

		scanner.close();


	}

}
