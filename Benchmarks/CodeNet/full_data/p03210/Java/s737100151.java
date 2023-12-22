
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static String solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		return (N == 3 || N == 5 || N == 7) ? "YES" : "NO";
	}
}