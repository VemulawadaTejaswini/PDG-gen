import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		Map<Integer, String> map = new TreeMap<>();
		for (int i=(x-k+1); i<(x+k); i++) {
			map.put(i, String.valueOf(i));
		}

		System.out.println(String.join(" ", map.values()));
	}

}
