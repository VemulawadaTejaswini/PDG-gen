import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 観光スポットの個数
		int N = sc.nextInt() + 2;
		// 観光スポットのx座標
		int[] spots = new int[N];
		spots[0] = 0;
		spots[N-1] = 0;
		for(int i = 1; i < N - 1; i++) {
			int X = sc.nextInt();
			spots[i] = X;
		}

		for(int i = 1; i < N - 1; i++) {
			int cost = 0;
			int[] tmpSpots = spots.clone();
			tmpSpots[i] = spots[i - 1];
			// arrayPrint(tmpSpots);
			for(int j = 1; j < N; j++) {
				cost += Math.abs(tmpSpots[j] - tmpSpots[j-1]);
			}
			System.out.println(cost);
		}
	}

	public static void arrayPrint(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

}
