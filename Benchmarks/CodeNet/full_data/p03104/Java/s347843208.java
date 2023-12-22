import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		long kekka = 0;

		int kosuu = (int)(B-A+1)%4;

		switch (kosuu) {

		case 0:

			kekka = 0;
			break;
		case 1:

			kekka = (A+B)/2;
			break;
		case 2:

			kekka = A^B;
			break;
		case 3:

			kekka = (A^B)^((A+B)/2);
			break;
		}

		System.out.println(kekka);
	}
}