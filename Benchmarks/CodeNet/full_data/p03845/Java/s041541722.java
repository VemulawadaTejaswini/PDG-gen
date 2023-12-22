
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String... args) {
		new Main().solve().forEach(System.out::println);
	}
	public List<String> solve() {
		List<String> result = new ArrayList<>();
		try(Scanner sc = new Scanner(System.in)) {
		    int n = sc.nextInt();
		    int[] t = new int[n];
		    for(int i = 0; i < n; i++) {
		    	t[i] = sc.nextInt();
		    }
		    int sum = IntStream.of(t).sum();
		    int m = sc.nextInt();
		    for(int i = 0; i < m; i++) {
		    	int p = sc.nextInt();
		    	int x = sc.nextInt();
		    	result.add(Integer.toString(sum - t[p - 1] + x));
		    }
		}
		return result;
	}
}
