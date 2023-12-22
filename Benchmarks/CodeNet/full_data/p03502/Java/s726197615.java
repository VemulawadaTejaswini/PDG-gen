import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] NcharList = N.toCharArray();
		int total = 0;
		for (char Nchar : NcharList) {
			total += Character.getNumericValue(Nchar);
		}
		System.out.println(Integer.parseInt(N)%total == 0 ? "Yes": "No");


	}
}
