import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int count = 0;

		for (long i = Long.parseLong(line[0]); i < Long.parseLong(line[1]) + 1; i++) {
			if (i % Integer.parseInt(line[2]) == 0) {
				count++;
			}
		}

		System.out.println(count);

	}
}
