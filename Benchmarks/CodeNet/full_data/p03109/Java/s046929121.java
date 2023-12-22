import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		
		scanner.close();
		
		int year  = Integer.valueOf(s.substring(0, 4));
		int month = Integer.valueOf(s.substring(5, 7));
		int day   = Integer.valueOf(s.substring(8, 10));
		
		int value = year*10000 + month*100 + day;

		if (value <= 20190430) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}

}