import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long takahashi = scan.nextLong();
		long aoki = scan.nextLong();
		long koudou = scan.nextLong();
		int countT = 0;
		int countA = 0;

			if(koudou <= takahashi) {
				 takahashi = takahashi - koudou;

			}else if( koudou <= takahashi+aoki) {

				aoki = aoki - (koudou - takahashi);
				takahashi = 0;

			}else if(takahashi + aoki < koudou) {
				takahashi = 0;
				aoki = 0;
			}

		System.out.println(takahashi);
		System.out.println(aoki);

		scan.close();

	}

}
