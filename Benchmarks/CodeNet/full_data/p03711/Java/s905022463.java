import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String x = "," + sc.next() + ",";
		String y = "," + sc.next() + ",";
		String a = ",1,3,5,7,8,10,12,";
		String b = ",4,6,9,11,";

		if (a.contains(x) && a.contains(y)) {
			System.out.println("Yes");
		} else if (b.contains(x) && b.contains(y)) {
			System.out.println("Yes");
		} else if (x.equals(",2,") && y.equals(",2,")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
