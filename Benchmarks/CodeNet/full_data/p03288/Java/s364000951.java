import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scannerR = new Scanner(System.in);
		int r = scannerR.nextInt();

		if (0<=r && r<1200) {
			System.out.println("ABC");
		}else if (1200<=r && r<2800) {
			System.out.println("ARC");
		}else {
			System.out.println("AGC");
			}




	}

}
