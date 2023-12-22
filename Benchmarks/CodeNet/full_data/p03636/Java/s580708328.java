import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.print(S.substring(0,1));
		System.out.print(S.length()-2);
		System.out.print(S.substring(S.length()-1,S.length()));
	}
	public static int sample() {
		return 1;
	}

}
