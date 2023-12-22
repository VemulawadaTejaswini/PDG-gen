import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	String S = scanner.next();
		String[] splitArray = S.split("");
		String x = splitArray[2];
		String y = splitArray[3];
		String z = splitArray[4];
		String w = splitArray[5];
		if (x.equals(y) && z.equals(w)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
