import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		Double aa = a / 0.08;
		Double bb = b / 0.10;

		Integer i = aa.intValue();
		Integer j = bb.intValue();

		if (i == j) {
			System.out.println(i);
		} else {
			boolean bool = true;
			while (bool) {
				Double c = (i + 1) / 0.08;
				Double d = (j + 1) / 0.10;
				Integer cc = c.intValue();
				Integer dd = d.intValue();
				if (cc == i) {
					if (cc == dd) {
						System.out.println(cc);
						bool = false;
					}
				} else {
					System.out.println("-1");
					bool = false;
				}
			}
		}

		sc.close();
	}

}
