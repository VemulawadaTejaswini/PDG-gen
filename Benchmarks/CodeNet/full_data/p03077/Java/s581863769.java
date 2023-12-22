import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		//コマンドライン引数取得部分
		Scanner scanner = new Scanner(System.in);
		//グループ人数
		int people = scanner.nextInt();
		//乗客数
		ArrayList<Integer> passengerNumList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			passengerNumList.add(scanner.nextInt());
		}
		scanner.close();

		//最小移動時間
		int time = 0;
		//各都市に残っている人数
		Integer[] cityNumList = { people, 0, 0, 0, 0, 0 };

		while (cityNumList[5] != people) {
			for (int i = 4; 0 <= i; i--) {
				if (cityNumList[i] > 0) {
					if (cityNumList[i] > passengerNumList.get(i)) {
						cityNumList[i + 1] += passengerNumList.get(i);
						cityNumList[i] -= passengerNumList.get(i);
					} else {
						cityNumList[i + 1] += cityNumList[i];
						cityNumList[i] = 0;
					}
				}
			}
			time++;
		}
		System.out.println(time);
	}

}
