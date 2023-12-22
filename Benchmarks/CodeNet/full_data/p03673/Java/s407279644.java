import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b = "";

		for (int i = 0; i < n; i++) {
			String a = String.valueOf(sc.nextInt());
			b += a;
			b = new StringBuilder(b).reverse().toString();
		}

		System.out.println(b.replace("", " ").substring(1));

		sc.close();

	}

}