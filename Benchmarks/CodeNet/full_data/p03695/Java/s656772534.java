
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void solveColorfulLeaderboard() throws IOException {
		int n;
		int cntColor = 0;
		int cntOverRed = 0;
		boolean red = false;
		boolean orange = false;
		boolean yellow = false;
		boolean blue = false;
		boolean sky = false;
		boolean green = false;
		boolean brown = false;
		boolean grey = false;
		int ai;

		String line;
		String[] split;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		line = br.readLine();
		n = Integer.parseInt(line);
		line = br.readLine();
		split = line.split(" ");

		for (int i = 0; i < n; i++) {
			ai = Integer.parseInt(split[i]);
			if (1 <= ai && ai <= 399 && grey == false) {
				grey = true;
				cntColor++;
			} else if (400 <= ai && ai <= 799 && brown == false) {
				brown = true;
				cntColor++;
			} else if (800 <= ai && ai <= 1199 && green == false) {
				green = true;
				cntColor++;
			} else if (1200 <= ai && ai <= 1599 && sky == false) {
				sky = true;
				cntColor++;
			} else if (1600 <= ai && ai <= 1999 && blue == false) {
				blue = true;
				cntColor++;
			} else if (2000 <= ai && ai <= 2399 && yellow == false) {
				yellow = true;
				cntColor++;
			} else if (2400 <= ai && ai <= 2799 && orange == false) {
				orange = true;
				cntColor++;
			} else if (2800 <= ai && ai <= 3199 && red == false) {
				red = true;
				cntColor++;
			} else if (3200 <= ai) {
				cntOverRed++;
			}
		}
		System.out.println(cntColor + " " + cntColor + cntOverRed);

		br.close();
	}

	public static void main(String[] args) {
		try {
			solveColorfulLeaderboard();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
