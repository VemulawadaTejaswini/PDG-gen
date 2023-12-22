import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ary = new int[n][2];
		for (int i = 0; i < n; i++) {
			int[] temp = new int[2];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			ary[i] = temp;
		}
		int tPoint = ary[0][0];
		int aPoint = ary[0][1];
		for (int i = 1; i < n; i++) {
			if (tPoint < aPoint) {
				int newAPoint = 0;
				if (aPoint > ary[i][1]) {
					newAPoint = (aPoint / ary[i][1]) * ary[i][1];
				} else {
					newAPoint = ary[i][1];
				}
				int newTPoint = newAPoint / ary[i][1] * ary[i][0];
				while (aPoint > newAPoint || newTPoint < tPoint) {
					newAPoint += ary[i][1];
					newTPoint = newAPoint / ary[i][1] * ary[i][0];
				}
				aPoint = newAPoint;
				tPoint = newTPoint;
			} else {
				int newTPoint = 0;
				if (tPoint > ary[i][0]) {
					newTPoint = (tPoint / ary[i][0]) * ary[i][0];
				} else {
					newTPoint = ary[i][0];
				}
				int newAPoint = newTPoint / ary[i][0] * ary[i][1];
				while (tPoint > newTPoint || newAPoint < aPoint) {
					newTPoint += ary[i][0];
					newAPoint = newTPoint / ary[i][0] * ary[i][1];
				}
				tPoint = newTPoint;
				aPoint = newAPoint;
			}
		}
		System.out.println(aPoint + tPoint);
	}

}