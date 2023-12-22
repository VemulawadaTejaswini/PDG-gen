import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int len = s.length();
		System.out.println(s.substring(0, 4)+" "+s.substring(4, len));
	}

}