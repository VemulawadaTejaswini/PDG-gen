import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		long ans = IntStream.rangeClosed(1, N).filter(s -> String.valueOf(s).length() % 2 != 0).count();

		System.out.println(ans);

		sc.close();
	}
}
