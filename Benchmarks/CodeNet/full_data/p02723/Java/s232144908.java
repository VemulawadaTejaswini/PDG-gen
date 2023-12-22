import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	String S = scanner.next();
	 	int N = S.length();
		String[] splitArray = S.split("");
		if (splitArray[2].equals(splitArray[3])) {
			if (splitArray[4].equals(splitArray[5])) {
				System.out.println("Yes");
			}
		} else {
			System.out.println("No");
		}
	}
}
