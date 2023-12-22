import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;

		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			String[] tmp = line.split(" ");

			int numA = Integer.parseInt(tmp[0]);
			int numB = Integer.parseInt(tmp[1]);
			int numC = Integer.parseInt(tmp[2]);

			int cnt = 0;
			while (true) {

				if (cnt >= numC || numA > numB) {
					break;
				}

				numB -= numA;
				cnt++;
			}

			System.out.println(cnt);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}