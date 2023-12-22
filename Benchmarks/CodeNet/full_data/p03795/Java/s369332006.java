import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		int x = 800 * N;
		int y = (N / 15) * 200;
		int answer = x - y;
		System.out.println(answer);
	}
}
