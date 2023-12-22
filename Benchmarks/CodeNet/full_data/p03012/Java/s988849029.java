import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int Weight[] = new int[N];
		int S1 = 0;
		int S2 = 0;
		int Number = 0;
		int data[] = new int[N];
		for (int i = 0;i < N; i++) {
			int x = scanner.nextInt();
			Weight[i] = x;
		}

		for (int i = 0; i < N; i++) {
			S1 = 0;
			for (int j = 0; j < i; j++) {
				S1 += Weight[j];
			}
			S2 = 0;
			for (int k = i; k < N; k++) {
				//System.out.println("どうかな" + Weight[k]);
				S2 += Weight[k];
				//System.out.println("1個ずつ" + S2);
			}
			// 			System.out.println("S1は" + S1);
			// 			System.out.println("S2は" + S2);
			if (S2 - S1 >= 0) {
				Number = S2 - S1;
			} else {
				Number = S1 - S2;
			}
			data[i] = Number;
			// 			System.out.println(data[i]);
		}

		//		for (int i=0; i<data.length; i++) {
		//			if (min > data[i]) {	//現在の最小値よりも小さい値が出たら
		//				min = data[i];	//変数minに値を入れ替える
		//			}
		//		}
		//		System.out.println(min);
		// 最小値を求める
		int min = data[0];
		for(int i = 0; i < data.length; i++)
			min = Math.min(min,data[i]);
		System.out.println(min);
	}
}