//A - Maximize the Formula

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());

		if(a == 1) {
			System.out.println("Hello World");
			return;
		}

		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

			System.out.println(b + c);
	}
}