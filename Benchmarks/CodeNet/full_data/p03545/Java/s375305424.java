import java.util.Scanner;

class TrainTicket {

}

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String abcd = scan.next();
		if (Character.getNumericValue(abcd.charAt(0)) + Character.getNumericValue(abcd.charAt(1)) + Character.getNumericValue(abcd.charAt(2)) + Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "+" + Character.getNumericValue(abcd.charAt(1)) + "+" + Character.getNumericValue(abcd.charAt(2)) + "+" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) - Character.getNumericValue(abcd.charAt(1)) + Character.getNumericValue(abcd.charAt(2)) + Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "-" + Character.getNumericValue(abcd.charAt(1)) + "+" + Character.getNumericValue(abcd.charAt(2)) + "+" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) + Character.getNumericValue(abcd.charAt(1)) - Character.getNumericValue(abcd.charAt(2)) + Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "+" + Character.getNumericValue(abcd.charAt(1)) + "-" + Character.getNumericValue(abcd.charAt(2)) + "+" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) + Character.getNumericValue(abcd.charAt(1)) + Character.getNumericValue(abcd.charAt(2)) - Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "+" + Character.getNumericValue(abcd.charAt(1)) + "+" + Character.getNumericValue(abcd.charAt(2)) + "-" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) + Character.getNumericValue(abcd.charAt(1)) - Character.getNumericValue(abcd.charAt(2)) - Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "+" + Character.getNumericValue(abcd.charAt(1)) + "-" + Character.getNumericValue(abcd.charAt(2)) + "-" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) - Character.getNumericValue(abcd.charAt(1)) + Character.getNumericValue(abcd.charAt(2)) - Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "-" + Character.getNumericValue(abcd.charAt(1)) + "+" + Character.getNumericValue(abcd.charAt(2)) + "-" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) - Character.getNumericValue(abcd.charAt(1)) - Character.getNumericValue(abcd.charAt(2)) + Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "-" + Character.getNumericValue(abcd.charAt(1)) + "-" + Character.getNumericValue(abcd.charAt(2)) + "+" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		} else if (Character.getNumericValue(abcd.charAt(0)) - Character.getNumericValue(abcd.charAt(1)) - Character.getNumericValue(abcd.charAt(2)) - Character.getNumericValue(abcd.charAt(3)) == 7) {
			System.out.println(
					Character.getNumericValue(abcd.charAt(0)) + "-" + Character.getNumericValue(abcd.charAt(1)) + "-" + Character.getNumericValue(abcd.charAt(2)) + "-" + Character.getNumericValue(abcd.charAt(3)) + "=7");
		}
	}
}