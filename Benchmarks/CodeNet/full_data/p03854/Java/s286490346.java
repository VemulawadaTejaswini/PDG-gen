import java.util.Scanner;

// https://atcoder.jp/contests/abc049/tasks/arc065_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		scanner = null;

		String[] divineArray = {"dream","dreamer","erase","eraser"};

		// 入力した値を反転
		str = ReverseString(str);
		for(int i=0;i<divineArray.length;i++) {
			divineArray[i] = ReverseString(divineArray[i]);
		}

		boolean loopFlag = true;
		boolean flag = false;

		do {
			for(String divineStr:divineArray) {
				int length = divineStr.length();
				if(length>str.length()) {
					loopFlag = false;
				}else {
					if(str.substring(0,length).equals(divineStr)) {
						str = str.substring(length);
						loopFlag = true;
						if(str.length()==0) {
							loopFlag = false;
							flag = true;
						}
						break;
					}else {
						loopFlag = false;
					}
				}
			}
		}while(loopFlag);

		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	// str を反転するメソッド。
	public static String ReverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		sb = null;
		return str;
	}

}
