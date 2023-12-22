import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String strS = scan.next()
				,strT = scan.next();
		int countA = scan.nextInt()
				, countB = scan.nextInt();
		String u = scan.next();

		scan.close();

		System.out.println(strS + " : " + strT);

		if (u.equals(strS)) {
			countA--;
		} else {
			countB--;
		}

		System.out.println(countA + " " + countB);
	}

}
