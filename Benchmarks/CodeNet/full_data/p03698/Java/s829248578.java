import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		sc.close();
		boolean isYes = true;
		for (int i = 0; i < line1.length(); i++) {
			if (i ==  line1.length() - 1) {
				break;
			}
			String temp = line1.substring(i + 1);
			if (temp.indexOf(line1.charAt(i)) >= 0) {
				isYes = false;
				break;
			}
		}
		if (isYes) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}