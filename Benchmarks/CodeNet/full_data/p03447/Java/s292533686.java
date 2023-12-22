import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// total money
		int X = sc.nextInt();
		// price of cake
		int A = sc.nextInt();
		// price of daunts
		int B = sc.nextInt();

		int rmaftercake = X - A;
		int daunutsnum = rmaftercake / B;
		int rmafterdanuts = rmaftercake - B * daunutsnum;
		System.out.println(rmafterdanuts);

	}

}
