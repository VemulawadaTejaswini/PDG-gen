import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		System.out.println(solve());
	}
 
	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		return 6 - A - B;
	}
}