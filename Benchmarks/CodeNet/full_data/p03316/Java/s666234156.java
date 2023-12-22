import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		int Sn = 0;

		for (int i = 0; i < N.length(); i++) {
			Sn += Integer.parseInt(String.valueOf(N.charAt(i)));
		}
		System.out.println(Integer.parseInt(N) % Sn == 0 ? "Yes" : "No");
	}

}
