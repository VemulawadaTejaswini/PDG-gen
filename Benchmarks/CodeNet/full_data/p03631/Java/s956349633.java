import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "";
		String[] param = a.split("");
		for (int i = param.length; i > 0; i--) {
			b += param[i];
		}
		if (a.equals(b) == true) {
			System.out.println("Yes");
		} else if (a.equals(b) == false) {
			System.out.println("No");
		}

	}

}