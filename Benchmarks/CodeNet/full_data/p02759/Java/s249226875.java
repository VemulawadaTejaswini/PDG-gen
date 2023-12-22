import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		System.out.println((N + 1) / 2);
		sc.close();
	}

}