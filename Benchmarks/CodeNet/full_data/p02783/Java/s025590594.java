import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();

		int H = Integer.parseInt(line.split("\\s+")[0]);
		int A = Integer.parseInt(line.split("\\s+")[1]);

		int res = (int)Math.ceil(1.0 * H / A);
		System.out.println(res);
	}


}
