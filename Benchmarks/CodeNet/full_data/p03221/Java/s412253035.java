import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[N];
		String[] ans = new String[M];

		Map<Integer, int[]> citys = new TreeMap<>();

		for(int i=0;i<M;i++) {
			int n = sc.nextInt();
			int y = sc.nextInt();
			int[] info = new int[2];
			info[0] = n;
			info[1] = i;
			citys.put(y, info);
		}

		for(int key : citys.keySet()) {
			int[] c = citys.get(key);
			ans[c[1]] = String.format("%06d%06d", c[0],++P[c[0]-1]);
		}

		for(String a : ans) {
			System.out.println(a);
		}

		sc.close();


	}
}
