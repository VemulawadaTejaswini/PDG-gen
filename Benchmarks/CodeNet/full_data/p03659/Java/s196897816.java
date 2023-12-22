import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		final int N = s.nextInt();

		int[] cards = new int[N];
		int grandTotal = 0;
		for(int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(s.next());
			grandTotal += cards[i];
		}
		s.close();

		int subTotal = 0;
		int min = (int)Math.pow(10.0, 9.0);
		for(int i = 0; i < N-1; i++) {
			subTotal += cards[i];
			int sa = grandTotal - subTotal*2;
			if(sa<0) sa = -sa;

			if(sa < min) {
				min = sa;
			}
		}
		System.out.println(min);


	}

}