import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		int total = 0;

		for (int i=0; i<N; i++){
			total += (L + i);
		}
		if (L <= 0 && (L + N -1) >= 0 ) {
			System.out.println(total);
		} else {
			if (total >= 0) {
				total = total - L;
			} else {
				total = total - (L + N -1);
			}
			System.out.println(total);
		}
	}
}