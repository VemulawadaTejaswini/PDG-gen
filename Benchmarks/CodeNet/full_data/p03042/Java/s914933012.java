import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean isMMYY = true;
		boolean isYYMM = true;

		String frontStr = s.substring(0,2);
		String backStr = s.substring(2,4);

		int frontInt = Integer.parseInt(frontStr);
		int backInt = Integer.parseInt(backStr);

		if (frontInt == 0 || frontInt > 12) isMMYY = false;
		if (backInt == 0 || backInt > 12) isYYMM = false;

		if (isMMYY && isYYMM) System.out.println("AMBIGUOUS");
		else if (isMMYY) System.out.println("MMYY");
		else if (isYYMM) System.out.println("YYMM");
		else System.out.println("NA");

	}
}