import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		System.out.println((N - S.replaceAll("ABC", "").length()) / 3);
	}
}