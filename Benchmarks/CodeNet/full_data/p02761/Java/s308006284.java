import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] seisu = new int[n];
		Map<Integer, Integer> sici = new HashMap<>();
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(s == 1 && c == 0) {
				System.out.println(-1);
				System.exit(0);
			}
			if(sici.containsKey(s)) {
				if(sici.get(s) != c) {
					System.out.println(-1);
					System.exit(0);
				}
			}
			sici.put(s, c);
			seisu[s - 1] = c;
		}

		if(!sici.containsKey(1)) {
			seisu[0] = 1;
		}

		for(int value : seisu) {
			System.out.print(value);
		}

		sc.close();
	}
}