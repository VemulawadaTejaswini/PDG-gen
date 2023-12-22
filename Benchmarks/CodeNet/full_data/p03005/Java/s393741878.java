import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		
		if (K!=1) {
			System.out.println(N - K);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}