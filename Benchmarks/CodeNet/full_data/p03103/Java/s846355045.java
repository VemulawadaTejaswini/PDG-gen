import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//軒数
		int M = sc.nextInt();	//ほしい本数


		Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			mMap.put(sc.nextInt(), sc.nextInt());
		}

		int ans = 0;
		for(Map.Entry<Integer, Integer> entry : mMap.entrySet()) {
			int buy = Math.min(M, entry.getValue());

			ans += buy * entry.getKey();

			M -= buy;
		}

		System.out.println(ans);

		sc.close();
	}