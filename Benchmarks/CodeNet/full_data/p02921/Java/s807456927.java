import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String yosou = s.next();
		String kekka = s.next();

		s.close();

		String[] yosou1 = yosou.split("", 0);
		String[] kekka1 = kekka.split("", 0);
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (yosou1[i] == kekka1[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
