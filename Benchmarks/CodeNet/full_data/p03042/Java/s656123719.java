import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int front = Integer.parseInt(s.substring(0, 2));
		int back = Integer.parseInt(s.substring(2));
		if ((front >= 1 && 12 >= front) && (back >= 1 && 12 >= back)) {
			System.out.println("AMBIGOUS");
		} else if ((front < 1 || 12 < front) && (back < 1 || 12 < back)) {
			System.out.println("NA");
		} else {
			System.out.println("YYMM");
		}
	}
}
