
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		
		int changed = 0;
		for(int i = 1; i < str.length; i++) {
			if(str[i] != str[i - 1]) {
				changed++;
			}
		}
		
		System.out.println(changed);
	}

}
