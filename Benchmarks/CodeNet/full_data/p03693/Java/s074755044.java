import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pRGBCards {
	public static void solveRGBCards() throws IOException {
		int r;
		int g;
		int b;
		String line;
		String[] split;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		line = br.readLine();
		split = line.split(" ");
		r = Integer.parseInt(split[0]);
		g = Integer.parseInt(split[1]);
		b = Integer.parseInt(split[2]);
		if ((g * 10 + b) % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		br.close();
	}

	public static void main(String[] args) {
		try {
			solveRGBCards();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
