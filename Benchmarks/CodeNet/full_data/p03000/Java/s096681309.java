import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);
		int[] L = new int[N];
		String[] Lstr = reader.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			L[i] = Integer.parseInt(Lstr[i]);
		}
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += L[i];
			if (sum > X) {
				ans = i+1;
				break;
			}
		}
		if (X >= sum) {
			ans = N+1;
		}
		System.out.println(ans);
		
	}
}
