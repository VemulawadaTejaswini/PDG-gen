import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタ0ブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		if (input == 1) {
			System.out.println("Hello World");
		} else {
			System.out.println(a + b);
		}
	}
}
