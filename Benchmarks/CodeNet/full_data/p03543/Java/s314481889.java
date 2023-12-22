import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] strs = str.split("");
		String out = "No";
		if ((strs[0].equals(strs[1]) && strs[1].equals(strs[2]))
				|| (strs[1].equals(strs[2]) && strs[2].equals(strs[3]))) {
			out = "Yes";
		}
		System.out.println(out);
	}

}
