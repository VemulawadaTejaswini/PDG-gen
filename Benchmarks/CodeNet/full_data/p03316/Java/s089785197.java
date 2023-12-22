import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		int ans = N.chars().map(s -> Character.getNumericValue(s)).sum();

		System.out.println(ans);

		sc.close();
	}

}