import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String sArray[] = new String[4];

		sArray = S.split("");

		if (sArray[0].equals(sArray[1]) || sArray[1].equals(sArray[2]) || sArray[2].equals(sArray[3])) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}
	}
}
