import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Main().doWork(args));
	}

	public String doWork(String[] args) {
		Scanner reader = new Scanner(System.in);

		String st = reader.next();
		String o1 = "YYMM";
		String o2 = "MMYY";
		String o3 = "AMBIGUOUS";
		String o4 = "NA";

		reader.close();

		int st1 = Integer.parseInt(st.substring(0, 2));
		int st2 = Integer.parseInt(st.substring(2));

		if (1 <= st1 && st1 <= 12) {
			if (1 <= st2 && st2 <= 12) {
				return o3;
			} else {
				return o2;
//			} else {
//				return o4;
			}
		} else {
			if (1 <= st2 && st2 <= 12) {
				return o1;
//			} else if (13 <= st2) {
//				return o4;
			} else {
				return o4;
			}
		}

		//		return ch.substring(0, k - 1) + ch.substring(k - 1, k + 1 - 1).toLowerCase() + ch.substring(k + 1 - 1);
	}
}
