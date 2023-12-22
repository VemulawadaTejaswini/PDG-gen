import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		float ansA = (float)(a / 0.08f);
		float ansB = (float)(b / 0.1f);

		int aa = ansA % 1 == 0 ? (int)ansA : (int)ansA +1;
		int bb = ansB % 1 == 0 ? (int)ansB : (int)ansB +1;

		int c = Math.max(aa, bb);

		Boolean isOK = true;
		if((int)(c * 0.08f) != a){
			isOK = false;
		}
		if((int)(c * 0.1f) != b){
			isOK = false;
		}

		int ans = isOK ? c : -1;
		System.out.println(ans);

	}

}
