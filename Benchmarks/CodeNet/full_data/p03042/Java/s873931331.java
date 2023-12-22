import java.util.Scanner;

public class Main {
	static int S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();

		int sen = S / 1000;
		int hyaku = (S % 1000) / 100;
		int zyu = (S % 100) / 10;
		int iti = S % 10;

//		System.out.println(sen);
//		System.out.println(hyaku);
//		System.out.println(zyu);
//		System.out.println(iti);

		int ue = sen * 10 + hyaku;
		int sita = zyu * 10 + iti;

//		System.out.println(ue);
//		System.out.println(sita);

		if (ue >= 1 && ue <= 12) {
			if (!(sita >= 1 && sita <= 12)) {
				System.out.println("MMYY");
			}
		}
		if (sita >= 1 && sita <= 12) {
			if (!(ue >= 1 && ue <= 12)) {
				System.out.println("YYMM");
			}
		}
		if (ue >= 1 && ue <= 12) {
			if (sita >= 1 && sita <= 12) {
				System.out.println("AMBIGUOUS");
			}
		}

		if (!(ue >= 1 && ue <= 12)) {
			if (!(sita >= 1 && sita <= 12 )) {
				System.out.println("NA");
			}
		}
		}
	}
