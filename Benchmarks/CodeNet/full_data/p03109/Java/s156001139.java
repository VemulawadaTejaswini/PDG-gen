import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.valueOf(scn.next().replaceAll("/", ""));
		if (20190430 < n) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}
		scn.close();
	}
}