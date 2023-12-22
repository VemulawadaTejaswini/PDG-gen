import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		int kisu = 0;
		int gusu = 0;
		for (int i = 0; i < O.length() + E.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(O.charAt(kisu));
				kisu++;
			} else {
				System.out.print(E.charAt(gusu));
				gusu++;
			}
		}

	}

}