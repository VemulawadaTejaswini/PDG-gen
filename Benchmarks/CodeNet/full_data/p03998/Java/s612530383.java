import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sa = new StringBuilder(in.next());
		StringBuilder sb = new StringBuilder(in.next());
		StringBuilder sc = new StringBuilder(in.next());

		char nextTurn = 'a';
		int N = sa.length() + sb.length() + sc.length();
		while(true){
			if (nextTurn == 'a') {
				if (sa.length() == 0) {
					System.out.println("A");
					break;
				}
				nextTurn = sa.charAt(0);
				sa.delete(0, 1);
			} else if (nextTurn == 'b') {
				if (sb.length() == 0) {
					System.out.println("B");
					break;
				}
				nextTurn = sb.charAt(0);
				sb.delete(0, 1);
			} else {
				if (sc.length() == 0) {
					System.out.println("C");
					break;
				}
				nextTurn = sc.charAt(0);
				sc.delete(0, 1);
			}
		}
		in.close();
	}
}