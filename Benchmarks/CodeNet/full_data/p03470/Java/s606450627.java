import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int d[] = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = Integer.parseInt(sc.next());
		}

		int result = Arrays.stream(d).distinct().toArray().length;
		out.println(result);
		out.flush();
	}
}