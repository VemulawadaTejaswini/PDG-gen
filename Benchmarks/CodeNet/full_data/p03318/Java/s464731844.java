import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		for (int i = 1, count = 0; count < k; i++) {
			if (i < 10) {
				count++;
				System.out.println(i);
				continue;
			}
			int ci = i;
			int sn = 0;
			while (ci != 0) {
				sn += ci % 10;
				ci /= 10;
			}
			if (sn % 10 == 0) {
				count++;
				System.out.println(i);
			}
		}

	}

}