import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = Integer.parseInt(scn.next());
		int total = Integer.parseInt(scn.next());
		int nowMoney = 0;
		boolean isSuccess = false;
		int lastNum = 0;
		for (int i = 0; i <= count; i++) {
			for (int j = 0; j <= count; j++) {
				lastNum = count - (i + j);
				nowMoney = i * 10000 + j * 5000 + lastNum * 1000;
				if (isSuccess) {
					break;
				}
				if (nowMoney == total && lastNum >= 0) {
					System.out.println(i + " " + j + " " + lastNum);
					isSuccess = true;
					break;
				}
			}
		}
		if (!isSuccess) {
			System.out.println("-1 -1 -1");
		}

	}

}
