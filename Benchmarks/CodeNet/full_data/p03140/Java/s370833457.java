import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();

		int cnt = 0;
		for (int i = 0; i < length; i++) {
			String a1 = a.substring(i, i+1);
			String b1 = b.substring(i, i+1);
			String c1 = c.substring(i, i+1);

			if (!a1.equals(b1) && !b1.equals(c1) && !c1.equals(a1)) {
				cnt += 2;
			} else if (!a1.equals(b1) || !b1.equals(c1)) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}

}