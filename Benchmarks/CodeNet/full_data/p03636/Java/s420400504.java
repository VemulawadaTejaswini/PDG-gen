import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "" + s.charAt(0) + (s.length()-2) + s.charAt(s.length()-1);

		System.out.println(ans);
	}

}