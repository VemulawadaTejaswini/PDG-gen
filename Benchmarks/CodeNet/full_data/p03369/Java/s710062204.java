import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		String s = sc.next();

		int ramen = 700;
		for (int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'o'){
				ramen+= 100;
			}
		}

		// 出力
		System.out.println(ramen);
	}
}