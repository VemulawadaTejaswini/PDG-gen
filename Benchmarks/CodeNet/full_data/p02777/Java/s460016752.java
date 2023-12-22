import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int rb = sc.nextInt();
		int bb = sc.nextInt();
		String U = sc.next();
		if (U.equals("red")) {
			rb--;
		}else {
			bb--;
		}
		System.out.println(rb + " " + bb);
	}

}
