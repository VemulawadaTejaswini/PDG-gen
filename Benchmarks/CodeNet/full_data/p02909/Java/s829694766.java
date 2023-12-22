import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String result = null;
		if (S.equals("Sunny")) {
			result = "Cloudy";
		} else if (S.equals("Cloudy")) {
			result = "Rainy ";
		} else {
			result = "Sunny";
		}
		System.out.println(result);
		sc.close();
	}
}