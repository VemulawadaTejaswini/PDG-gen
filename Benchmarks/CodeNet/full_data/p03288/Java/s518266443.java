import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int R = scanner.nextInt();
		
		if((0 <= R)&&(R < 1200)) {
			System.out.println("ABC");
		}else if ((1200 <= R)&&(R < 2800)) {
			System.out.println("ARC");
		}else {
			System.out.println("AGC");
		}

	}

}