
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int H = sc.nextInt();
		if(Q <= H) {
			System.out.println(0);
		} else {
			System.out.println(Q - H);
		}
	}
}