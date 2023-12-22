import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		if (1200 > R) {
			System.out.println("ABC");
		} else if (2800 > R) {
			System.out.println("ARC");
		} else {
			System.out.println("AGC");
		}
	}
}