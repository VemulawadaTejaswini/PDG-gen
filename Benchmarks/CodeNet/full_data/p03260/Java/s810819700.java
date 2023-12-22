import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr = sc.nextLine();
		String[] numArr = numStr.split(" ");
		int numA = Integer.parseInt(numArr[0]);
		int numB = Integer.parseInt(numArr[1]);
		
		System.out.println(existNumber(numA, numB));
	}
	
	private static String existNumber(int numA, int numB) {
		if ((numA * numB) % 2 == 0) {
			return "No";
		}
		return "Yes";
	}
}