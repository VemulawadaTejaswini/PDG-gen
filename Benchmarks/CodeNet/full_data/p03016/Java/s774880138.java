import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		Long M = sc.nextLong();
		String LL = "";
		Long S = 0L;
		Long total = 0L;
		Long result = 0L;

		for (Long i = 0L; i < L; i++) {
			S = A + B * i;
			LL += S;
		}

		total = Long.parseLong(LL);
		result = total % M;
		System.out.println(result);

	}

}