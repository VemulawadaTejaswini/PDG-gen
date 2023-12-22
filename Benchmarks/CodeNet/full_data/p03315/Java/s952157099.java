import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int s;
		int ss;
		int count = 1;
		int sho;
		try {
			Scanner sc = new Scanner(System.in);
			s = sc.nextInt();
			ss = s;

			if (s == 1) {
				System.out.println("Yes");
				return;
			}
			
			// 2進化した和を出す。
			while (s >= 2) {
				if (s % 2 == 1) {

					count++;

				}
				s = s / 2;


			}
			// 割り算する
			sho = ss % count;

		
			// 剰余が出たらNo
			if (sho == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
