import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		boolean c = false;
		for(int i = 0; i < s.length; i++) {
			if(s[i] == '7') {
				c = true;
				break;
			}
		}
		if(c) {
			System.out.println("Yes"); //C == true;
		}else{
			System.out.println("No"); //c == false の場合
		}
	}

	/*boolean true/false
			true = 正しい
			false = 間違ってる

			c = 7が入ってるかいなか
			7が入ってたら→OK			true
			7が入ってなかったら→だめ	false

			c == true いらない
			c ture ←trueが基準
			!c false
	*/
}
