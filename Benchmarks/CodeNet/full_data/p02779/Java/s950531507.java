import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static boolean flg = false;
	private static final String YES = "YES";
	private static final String NO = "NO";

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("桁数を入力してください");
		int digits = scanner.nextInt();
		
		List<Integer> numberLists = new ArrayList<Integer>();
		
		for (int i = 0; i < digits; i++) {
			if (i + 1 == digits) {
				System.out.println("最後の数字を入力してください");
			}else {
				System.out.println((i+1) + "番目の数字を入力してください");				
			}
			int number = scanner.nextInt();
			numberLists.add(number);
		}
		scanner.close();
		for (int i = 0; i < numberLists.size(); i++) {
			for (int j = 0; j < numberLists.size(); j++) {
				if (i != j && numberLists.get(i) == numberLists.get(j)) {
					flg = true;
					break;
				}
			}
		}
		if (flg) {
			System.out.println(YES);
		}else {
			System.out.println(NO);
		}
	}

}