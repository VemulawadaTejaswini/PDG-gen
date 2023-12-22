import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");

		for (int i = 0; i < Integer.parseInt(input[0]); i++) {
			String and =br.readLine();
			for (int j = 0; j < 2; j++) {
				System.out.println(and);
			}
		}

	}

}
