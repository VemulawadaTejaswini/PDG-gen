import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] aline = br.readLine().split(" ");

		int count = 0;
		String preslime = aline[0];
		int samecount = 1;

		for (int i = 1; i < n; i++) {
			if (preslime.equals(aline[i])) {
				samecount++;
			} else {
				count += samecount / 2;
				samecount = 1;
			}
			preslime = aline[i];
		}

		count += samecount / 2;

		System.out.println(count);

	}

}
