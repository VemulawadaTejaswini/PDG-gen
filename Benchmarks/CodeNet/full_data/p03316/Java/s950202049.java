import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		String temp = scanner.nextLine();
		int s = 0;

		for(int i = 0; i < temp.length();i++) {

			String t = String.valueOf(temp.charAt(i));
			s += Integer.parseInt(t);

		}

		if(Integer.parseInt(temp) % s == 0) {

			System.out.println("Yes");

		}else {

			System.out.println("No");

		}
	}
}
