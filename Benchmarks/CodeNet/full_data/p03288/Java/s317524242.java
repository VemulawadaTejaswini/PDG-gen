package practice.t.t.practice1;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rating = scan.nextInt();
		if(rating<1200) {
			System.out.println("ABC");
		}else if(rating<2800) {
			System.out.println("ARC");
		}else {
			System.out.println("AGC");
		}




		scan.close();

	}
}
