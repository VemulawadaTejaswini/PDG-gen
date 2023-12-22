import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static int solve() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int min = 753;
		for (int i = 0; i < s.length() - 2; i++) {
			System.out.println(s.substring(i, i + 2));
			int sum = Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753);
			if (sum <= min ) {
				min = sum;
			}
		}
		return min;
	}
}
