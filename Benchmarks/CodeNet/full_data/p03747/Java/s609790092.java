import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		int antNum = 0;
		int circleLength = 0;
		int time = 0;
		double[][] ants = null;
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] aaa = line.split(" ");
		antNum = Integer.parseInt(aaa[0]);
		circleLength = Integer.parseInt(aaa[1]);
		time = Integer.parseInt(aaa[2]);
		ants = new double[antNum][2];
		for (int i = 0; i < antNum; i++) {
			line = sc.nextLine();
			aaa = line.split(" ");
			ants[i][0] = Double.parseDouble(aaa[0]);
			ants[i][1] = Double.parseDouble(aaa[1]);
		}

		//0.5秒ごとに判定していく
		for (int i = 0; i < time*2; i++) {
			//それぞれの蟻の位置を算出
			for(int j = 0;j < antNum; j++){
				if (ants[j][1] == 1) {
					ants[j][0] += 0.5;
				} else {
					ants[j][0] -= 0.5;
				}

				if (ants[j][0] >= circleLength) {
					ants[j][0] -= circleLength;
				} else if (ants[j][0] < 0) {
					ants[j][0] += circleLength;
				}
			}
			// それぞれの蟻の位置がかぶっているかを判定
			for (int j = 0; j < antNum; j++) {
				for (int k = j + 1; k < antNum; k++) {
					if (ants[j][0] == ants[k][0]) {
						// かぶっていたら進行方向を反転
						ants[j][1] = ants[j][1] == 1 ? 2 : 1;
						ants[k][1] = ants[k][1] == 1 ? 2 : 1;
					}
				}
			}
		}
		for (double[] antAns : ants) {
			System.out.println((int) antAns[0]);
		}

		}
}
