import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = Integer.parseInt(sc.next());
//		int S = Integer.parseInt(sc.next());
		String[] S = sc.next().split("");
		
		int x = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			x += S[i].equals("I") ? 1 : -1;
			max = x > max ? x : max;
		}
		
		System.out.println(max < 0 ? 0 : max);
	}
}
