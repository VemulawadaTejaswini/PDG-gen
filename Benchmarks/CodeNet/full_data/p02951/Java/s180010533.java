import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		int rem = C - (A - B);
		if(rem > 0) {
			System.out.println(rem);
		}else {
			System.out.println(0);
		}
	}
}