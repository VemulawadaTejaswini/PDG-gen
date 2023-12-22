import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(0);

		String str1 = sc.next();
		if (str1.equals("Vacant")) {
			return;
		}

		recur(0, n, sc, str1, str1);

		return;
	}

	static void recur (int min, int max, Scanner sc, String leftGender, String rightGender) {

		int mid = (max+min)/2;
		System.out.println(mid);
		String str = sc.next();
		if(str.equals("Vacant")) {
			return;
		} else if (str.equals(leftGender) ^ ((mid-min)%2 == 0)) {
			recur(min, mid, sc, leftGender, str);
		} else {
			recur(mid, max, sc, str, rightGender);
		}

	}

}
