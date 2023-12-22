import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		long K = in.nextLong();
		S = S.replace("1", "");
		System.out.println(S.length() > 0 ? S.charAt(0) : 1);
		in.close();
	}
}