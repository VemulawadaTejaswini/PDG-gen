import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		executeA();
	}

	private static void executeA() {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String[] s1Array = s1.split(" ");

		try {
			int n = Integer.parseInt(s1Array[0]);
			int m = Integer.parseInt(s1Array[1]);

			int count = (n*(n-1) + m*(m-1))/2;
			PrintWriter pw = new PrintWriter(System.out);
			pw.println(count);
			pw.flush();
			pw.close();
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
