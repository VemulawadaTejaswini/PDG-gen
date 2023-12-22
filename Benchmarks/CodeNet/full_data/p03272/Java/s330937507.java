import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int i = sc.nextInt();
		System.out.println(K - i + 1);
		sc.close();
	}
}