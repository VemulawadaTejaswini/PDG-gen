import java.util.*;


class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String kisu = "0dd";
		String gusu = "Even";

		if (a * b % 2 == 0) {
			System.out.println(gusu);
		} else {
			System.out.println(kisu);
		}

	}
}