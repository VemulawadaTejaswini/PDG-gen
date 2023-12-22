import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力
		int amount_btn = sc.nextInt();
		int answer = 1;

		//ボタンの遷移先リスト
		ArrayList<Integer> array_btn = new ArrayList<>();

		for (int i = 0; i < amount_btn; i++) {
			int btn_destination = sc.nextInt();
			array_btn.add(btn_destination);
		}

		//ボタンが使われたかどうかの確認マップ
		Map<Integer, Integer> btn_map = new HashMap<Integer, Integer>();

		//初期値の使われていない状態：0
		for (int i = 0; i <= amount_btn; i++) {
			btn_map.put(i,0);
		}

		int j = 0;

		loop: while(j <= amount_btn) {
			//もしボタンの遷移先が2であれば、終了
			if (array_btn.get(j) == 2) {
				break loop;
			}

			//もしボタンの遷移先が2でなければ、
			else {

				//もしボタンをすでに使用したことがあれば、ループしているので終了
				if (btn_map.get(j) == -1) {
					answer = -1;
					break loop;
				}
				//もしボタン未使用であれば、ボタンを使用した状態にして、次のボタンに遷移
				else {
					btn_map.put(j,-1);
					answer ++;
					j = array_btn.get(j) -1;
				}

			}
		}
		System.out.println(answer);
	}
}
