import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long a = kb.nextLong();
		long b = kb.nextLong();
		long k = kb.nextLong();
		if (a >= 0) {
			if (a <= k) {
				k = k - a;
				a = 0;
			} else {
				a = a - k;
				k = 0;
			}
		}
		//System.out.println(k);
		if (b >= 0) {
			if (b <= k) {
				k = k - b;
				b = 0;
			} else {
				b = b - k;
				k = 0;
			}
		}
		System.out.println(a + " " + b);
		kb.close();
	}

}
