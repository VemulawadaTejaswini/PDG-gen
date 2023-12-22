import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int min = 1000000;
		for (int i = 0; i < s.length(); i++) {
			int cc = 0;
			for (int j = 0; j < s.length(); j++) {
				if (i == j)
					continue;
				if (j < i) {
					if ('W' == s.charAt(j))
						cc++;
				} else {
					if ('E' == s.charAt(j))
						cc++;
				}
			}
			min = Math.min(min, cc);
		}

		System.out.println(min);

	}

}
