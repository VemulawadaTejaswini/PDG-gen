import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		scan.close();
		System.out.println(S.substring(N)+S.substring(0,N));
	}
}
