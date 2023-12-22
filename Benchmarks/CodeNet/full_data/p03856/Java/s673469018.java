
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		int left = 0;
		
		while(left < str.length()) {
			if(str.length() >= left + 7 && str.substring(left, left + 7).equals("dreamer")) {
				left += 7;
			}
			else if(str.length() >= left + 6 && str.substring(left, left + 6).equals("eraser")) {
				left += 6;
			}
			else if(str.length() >= left + 5){
				String tmp = str.substring(left, left + 5);
				
				if(tmp.equals("dream") || tmp.equals("erase")) {
					left += 5;
				}
				else {
					System.out.println("NO");
					return;
				}
			}
			else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}

}
