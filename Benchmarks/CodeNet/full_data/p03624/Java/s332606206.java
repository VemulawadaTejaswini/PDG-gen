import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		Map<Character, Character> charList = new HashMap<>();

		for(int i = 0; i < S.length(); i++) {
			Character a = S.charAt(i);
			charList.put(a,a);
		}

		String answer = "None";

		for(char i = 'a'; i < 'z'; i++) {
			if(charList.containsKey(i)) {
				//飛ばす
			}else {
				answer = String.valueOf(i) ;
				break;
			}
		}

		System.out.println(answer);


	}

}
