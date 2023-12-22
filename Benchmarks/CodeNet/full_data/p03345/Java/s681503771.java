import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Long A = sc.nextLong();
			Long B = sc.nextLong();
			Long C = sc.nextLong();
			Long K = sc.nextLong();
			System.out.println(A - B);
		} catch (Exception e) {
			System.out.println("Unfair");
		}
	}
}