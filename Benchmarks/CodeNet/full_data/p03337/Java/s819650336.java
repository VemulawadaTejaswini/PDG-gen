import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int pura = A + B;
		int mai = A - B;
		int kake = A * B;

		int kotae;
		if (pura < mai) {
			kotae = mai;
		} else {
			kotae = pura;
		}
		if (kotae < kake) {
			kotae = kake;
		}
		System.out.println(kotae);

	}

}