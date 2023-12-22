import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//入力を数値に変換
		Scanner sc = new Scanner(System.in);
		int oto[] = new int[3];

		for (int i = 0; i < 3; i++) {
			oto[i] = sc.nextInt();
		}

		if(oto[0] != 5) {
			int toriaezu = oto[1];
			oto[1] = oto[0];
			oto[0] = toriaezu;
		}

		if(oto[2] != 5) {
			int toriaezu = oto[1];
			oto[1] = oto[2];
			oto[2] = toriaezu;
		}

		if(oto[0] == 5 && oto[1] == 7 && oto[2] == 5) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
}
}
