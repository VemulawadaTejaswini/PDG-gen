import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//文字取得
		String s = sc.next();
		String answer = "";
		sc.close();

		for(int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			//System.out.println(character);

			if(character == '0' || character == '1') {
				answer += character;
			}else if(character == 'B') {
				if(answer.length() == 0) {
					//何もしない
				}else{
					//文字があったら削る
					answer = answer.substring(0, answer.length()-1);
				}
			}
		}

		System.out.println(answer);
	}

}
