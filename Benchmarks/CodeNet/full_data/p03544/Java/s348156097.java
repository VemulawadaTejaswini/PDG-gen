import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();

		int[] lucas = new int[target + 1];

		lucas[0] = 2;
		lucas[1] = 1;

		for (int i = 2; i < lucas.length; i++) {
			lucas[i] = lucas[i - 2] + lucas[i - 1];
		}

		System.out.println(lucas[lucas.length - 1]);
	}

}
