import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A;
		String B;
		int i;
		A = sc.nextLine();
		B = sc.nextLine();
		int[] Anum = new int[A.length()];
		int[] Bnum = new int[B.length()];

		if (Anum.length > Bnum.length) {
			System.out.println("GREATER");
		} else if (Anum.length < Bnum.length) {
			System.out.println("LESS");
		} else {
			for (i = 0; i < A.length(); i++)
				Anum[i] = Character.getNumericValue(A.charAt(i));
			for (i = 0; i < B.length(); i++)
				Bnum[i] = Character.getNumericValue(B.charAt(i));

			for (i = 0; i < A.length(); i++) {
				if (Anum[i] < Bnum[i]) {
					System.out.println("LESS");
					break;
				} else if (Anum[i] > Bnum[i]) {
					System.out.println("GREATER");
					break;
				} else if (i == A.length() - 1 && Anum[i] == Bnum[i])
					System.out.println("EQUAL");
			}

		}
	}

}