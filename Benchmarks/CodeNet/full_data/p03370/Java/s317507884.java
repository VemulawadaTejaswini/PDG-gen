import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int donutKinds = Integer.parseInt(tokens[0]);
		int sozaiWeight = Integer.parseInt(tokens[1]);
		int[] mList = new int[donutKinds];
		for (int i = 0; i < donutKinds; ++i) {
			mList[i] = Integer.parseInt(in.nextLine());
		}
		// 最低限の消費量
		int result = donutKinds;
		int remainWeight = sozaiWeight;
		for (int i = 0; i < donutKinds; ++i) {
			remainWeight -= mList[i];
		}
		// 最小の消費量の種類を探す
		int minSpentWeight = Integer.MAX_VALUE;
		for (int i = 0; i < donutKinds; ++i) {
			if (minSpentWeight > mList[i]) {
				minSpentWeight = mList[i];
			}
		}
		result += (int) Math.floor((double) remainWeight / (double) minSpentWeight);
		System.out.println(result);
		in.close();
	}

}