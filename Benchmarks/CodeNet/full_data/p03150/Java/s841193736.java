import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String impstr = sc.nextLine();
		String[] imp = impstr.split("");
		String[] target = { "k", "e", "y", "e", "n", "c", "e" };

		if (imp.length < target.length) {
			System.out.println("NO");
		} else if (imp.length == target.length) {
			if (impstr.equals("keyence")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {

			boolean skipFlag = false;
			int i = 0;
			int t = 0;
			while (i < imp.length && t < target.length) {
				if (imp[i].equals(target[t])) {// 同じ文字だったら次の文字へ
					i++;
					t++;
				} else if (skipFlag == false) {
					// 別の文字だったら、targetの文字が出てくる位置を探す
					i++;
					skipFlag = true;
					for (int k = 1; k < imp.length - i; k++) {
						if (imp[i + k].equals(target[t])) {
							i = i + k;
							break;
						}
					}
				} else if (skipFlag == true) {
					break;
				}
			}
			if (t == target.length) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

}