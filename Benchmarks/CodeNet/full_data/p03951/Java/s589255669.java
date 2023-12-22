import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s1 = scanner.next();
		String s2 = scanner.next();
		checkLength(n, s1, s2);
	}
	
	public static void checkLength(int n,String s1,String s2){
		for (int j = 0; j < n; j++) {
			if (s1.substring(j)
					.equals(s2.substring(0, n - j))) {
				System.out.println( n + j);
				return;
			}
		}
		System.out.println(2 * n);
	}
}
