import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int pow = 1;

		for (int i = 0; i < num; i++) {
			pow *= (i + 1);
		}

		pow = (int) (pow % (Math.pow(10, 9) + 7));

		System.out.println(pow);

		sc.close();
	}

}
