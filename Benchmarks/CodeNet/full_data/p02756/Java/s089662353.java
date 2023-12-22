import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int q = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 0; i < q; i++) {
			String str[] = br.readLine().split(" ");

			if (str[0].equals("1")) {
				count++;
			} else {
				if (str[1].equals("1")) {
					if (count % 2 == 0) {
						s = str[2] + s;
					} else {
						s = s + str[2];
					}
				} else {
					if (count % 2 == 0) {
						s = s + str[2];
					} else {
						s = str[2] + s;
					}
				}
			}
		}

		if (count % 2 == 0) {
			System.out.println(s);
		} else {
			String str[] = s.split("");
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(str[i]);
			}
			System.out.println();
		}
	}
}
