import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N, M;
	static int[][] TABLE;
	static int[] PRECITY;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		TABLE = new int[M][2];
		for (int i = 0; i < M; i++) {
			TABLE[i][0] = sc.nextInt();
			TABLE[i][1] = sc.nextInt();
		}
		PRECITY = new int[N];
		for (int i = 0; i < M; i++) {
			int preNo = TABLE[i][0];
			PRECITY[preNo - 1] += 1;
		}
		for (int i = 0; i < N; i++) {
			int[] tempArr = new int[PRECITY[i]];
			int arrTop = 0;
			for (int j = 0; j < M; j++) {
				if (TABLE[j][0] == i + 1)
					tempArr[arrTop++] = TABLE[j][1];
			}
			Arrays.sort(tempArr);
			for (int j = 0; j < M; j++) {
				int t1 = getIndex(TABLE[j][1], tempArr);
				if (t1 != -1)
					TABLE[j][1] = t1;
			}

		}
		for (int i = 0; i < TABLE.length; i++) {
			System.out.println(forMatSize("" + TABLE[i][0]) + forMatSize("" + TABLE[i][1]));
		}
	}

	public static String forMatSize(String str) {
		int len = ("" + str).length();
		for (int i = 0; i < 6 - len; i++) {
			str = "0" + str;
		}
		return str;
	}

	public static int getIndex(int num, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i])
				return i + 1;
		}
		return -1;
	}

}
