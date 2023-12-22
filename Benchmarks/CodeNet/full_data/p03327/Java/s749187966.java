import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declare
		String out = "ABD";

		// Receive number
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

		// Check
		if ((1 <= n) && (n <= 999)) {
			out = "ABC";
		} else if ((1000 <= n) && (n <= 1998)) {
			out = "ABD";
		}

		// Display
		System.out.print(out);
	}
}