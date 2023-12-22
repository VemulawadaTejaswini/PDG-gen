import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder answer = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			String str = s.valueOf(i);
			switch(str) {
				case "0":
					answer.append("0");
					break;
				case "1":
					answer.append("1");
					break;
				case "B":
					if(answer.length() == 0) {
						break;
					}else {
						answer.deleteCharAt(answer.length()-1);
						break;
					}
			}
		}
		System.out.println(answer.toString());
		sc.close();
	}

}