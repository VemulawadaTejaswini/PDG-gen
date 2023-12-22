import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String oddS = "";

		for (int i = 0; i < S.length(); i++) {
			if(i%2 == 0) {
				oddS += S.substring(i, i+1);
			}
		}
		System.out.println(oddS);
	}
}
