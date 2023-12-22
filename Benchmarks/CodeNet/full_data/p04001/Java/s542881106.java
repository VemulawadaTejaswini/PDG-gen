import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String S = br.readLine();
			double length = S.length();
			double sum = 0;
			for (int i = 0; i < length; i++) {
				double left = Math.ceil(Math.pow(2, i - 1));
				for (int j = i + 1; j < length + 1; j++) {
					String s = S.substring(i, j);
					double n = Double.valueOf(s);
					double right = Math.ceil(Math.pow(2, length - j - 1));
					sum += left * n * right;
				}
			}
			System.out.println(sum);
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());

		}

	}
}
