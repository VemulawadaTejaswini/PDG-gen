import java.util.Scanner;

// https://atcoder.jp/contests/abc049/tasks/arc065_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();

		String[] divineArray = {"dream","dreamer","erase","eraser"};

		// 入力した値を反転
		str = ReverseString(str);
		for(int i=0;i<divineArray.length;i++) {
			divineArray[i] = ReverseString(divineArray[i]);
		}

		boolean flag = true;

		do {
			for(String divineStr:divineArray) {
				int length = divineStr.length();
				if(length>str.length()) {
					System.out.println("NO");
					flag = false;
					break;
				}else {
					if(str.substring(0,length).contains(divineStr)) {
						str = str.substring(length);
						if(str.length()==0) {
							flag = false;
							System.out.println("YES");
						}
						break;
					}else {
						System.out.println("NO1");
						flag = false;
						break;
					}
				}
			}
		}while(flag);
	}

	// str を反転するメソッド。
	public static String ReverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		return str;
	}

}
