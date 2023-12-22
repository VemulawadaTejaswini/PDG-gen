import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String orgS = scan.nextLine();
		char[] t = scan.nextLine().toCharArray();
		int size = t.length;
		String s = "";

		for (int i = 0; i < size; i++) {
			s = s.concat(orgS);
		}

		// 最大値を超えるような条件は与えられない
//		double max = Math.pow(10, 100);

		int index = -1;
		boolean notExists = false;
		for (char c : t) {
			// 続きから後ろを確認
			index = s.indexOf(c, index + 1);
			if (index == -1) {
				notExists = true;
				break;
			}
		}
		if (notExists) {
			System.out.println(-1);
		}
		else {
			System.out.println(index + 1);
		}
	}
}
