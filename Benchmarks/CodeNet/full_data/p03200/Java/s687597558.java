import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int cnt = 0;

		boolean can = true;

		while(can) {

			can = false;

			if (S.contains("BW")) {
				cnt += (S.length() - S.replaceAll("BW","").length())/2;
				can = true;
				S = S.replaceAll("BW", "WB");
			}

		}
		System.out.println(cnt);
	}

}
