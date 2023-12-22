import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		long a = Long.parseLong(line[0]);
		long b = Long.parseLong(line[1]);
		long x = Long.parseLong(line[2]);

		long count = 0;

		long ad = a / x;
		long bd = b / x;

		count = bd - ad;

		if (a % x == 0) {
			count++;
		}

		System.out.println(count);

	}
}
