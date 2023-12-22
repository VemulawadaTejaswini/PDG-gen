import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		int count = 0;

		for (int i = a; i < b; i++) {
			int ue = i / 10000;
			int sita = i % 10;
			if (ue == sita) {
				ue = (i / 1000) % 10;
				sita = (i % 100) / 10;
				if (ue == sita)
					count++;
			}
		}
		System.out.println(count);
	}
}
