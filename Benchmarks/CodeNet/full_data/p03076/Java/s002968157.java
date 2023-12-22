import java.util.Scanner;

// C - Monsters Battle Royale
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = 5;

	int[] Time = new int[N]; // 注文してから届くまでの時間
	for (int i = 0; i < N; i++) {
		Time[i] = sc.nextInt();
	}

	int[] nextTime = new int[N]; // 注文してから次に注文できるまでの時間
	for (int i=0; i<N;i++) {
		if(Time[i] % 10 == 0) nextTime[i] = Time[i];
		else nextTime[i] = Time[i] - Time[i] % 10 + 10;
	}

	int BestTime = 9999999; // 大きい値を適当に
	// 最後に注文するものを全通り計算
	for (int i = 0; i < N; i++) {
		int SumTime = 0;
		for (int j = 0; j < N; j++) {
			if (i == j) {
				// 最後の処理
				SumTime += Time[j];
				System.out.print("i:"+i);
				System.out.println("最後の処理:"+SumTime);
			} else {
				// 最後以外の処理
				SumTime += nextTime[j];
				System.out.print("i:"+i);
				System.out.println("最後以外の処理:"+SumTime);
			}
		}
		BestTime = Math.min(BestTime, SumTime);
	}
	System.out.println(BestTime);
	}
}