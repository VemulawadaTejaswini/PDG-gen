import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[]st = {
				"dream",
				"dreamer",
				"erase",
				"eraser"
		};
		Scanner sc = new Scanner(System.in);
		String inputString = sc.toString();
		boolean equalFlag = false;
		int inputStringLength = inputString.length();

		while(inputStringLength <= 0) {
			for(int i=0; i<4; i++) {
				if(inputString.endsWith(st[i])) {
					inputString = inputString.replaceAll(st[i], "");
					inputStringLength = inputString.length();
					equalFlag = true;
				}
			}
			if(equalFlag = false) break;
		}

		String result = equalFlag ? "Yes" : "No";
		System.out.println(result);
	}

}