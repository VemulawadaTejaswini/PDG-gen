import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		String[] array_a = a.split("");
		String[] array_b = b.split("");
		String[] array_c = c.split("");

		String card = array_a[0];

		int num_a = 1;
		int num_b = 0;
		int num_c = 0;

		roop: while (true) {
			switch (card) {
			case "a":
				if (num_a == array_a.length ) {
					break roop;
				}
				;
				card = array_a[num_a];
				num_a++;
				break;
			case "b":
				if (num_b == array_b.length ) {
					break roop;
				}
				;
				card = array_b[num_b];
				num_b++;
				break;

			case "c":
				if (num_c == array_c.length ) {
					break roop;
				}
				;
				card = array_c[num_c];
				num_c++;
				break;

			}

		}
		System.out.println(card.toUpperCase());
	}

}