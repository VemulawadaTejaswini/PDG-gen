import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String yyyy = S.substring(0, 4);
		String mm = S.substring(5, 7);
		String dd = S.substring(8, 10);

		if (Integer.parseInt(yyyy) >= 2019 && Integer.parseInt(mm) >= 5) {
			System.out.println("TBD");
		} else {
			System.out.println("Heisei");
		}



	}
}