import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		A();

	}

	private static void A() throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int kosuu = 0;
		br.close();

		for (int i = 0; i <= N; i++) {

			kosuu += i;

		}

		System.out.println(kosuu);
		;

	}

}
