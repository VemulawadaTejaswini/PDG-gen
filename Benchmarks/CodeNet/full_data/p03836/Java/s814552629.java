import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int sx = scanner.nextInt();
		int sy = scanner.nextInt();
		int tx = scanner.nextInt();
		int ty = scanner.nextInt();

		String result = "";
		// 1回目
		for(int i = 0; i < tx - sx; i++){
			result += "R";
		}
		for(int i = 0; i < ty - sy; i++){
			result += "U";
		}

		for(int i = 0; i < tx - sx; i++){
			result += "L";
		}
		for(int i = 0; i < ty - sy; i++){
			result += "D";
		}
		/// 2回目
		result += "D";
		for(int i = 0; i < tx - sx; i++){
			result += "R";
		}
		result += "R";
		for(int i = 0; i < ty - sy; i++){
			result += "U";
		}
		result += "ULU";

		for(int i = 0; i < tx - sx; i++){
			result += "L";
		}
		result += "L";
		for(int i = 0; i < ty - sy; i++){
			result += "D";
		}
		result += "DR";

	}

}
