import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			int cnt = Integer.parseInt(line);

			double result = 0.0;
			for (int i = 0; i < cnt; i++) {
				line = sc.nextLine();
				String[] tmp = line.split(" ");
				if (tmp[1].equals("BTC")) {
					result += Double.parseDouble(tmp[0]) * 380000.0;
				} else {
					result += Double.parseDouble(tmp[0]);
				}

			}

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}