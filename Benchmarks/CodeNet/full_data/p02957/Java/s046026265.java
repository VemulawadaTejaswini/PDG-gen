import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		int sum = A + B;
		if(sum % 2 == 0) {
			System.out.println(sum / 2);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}