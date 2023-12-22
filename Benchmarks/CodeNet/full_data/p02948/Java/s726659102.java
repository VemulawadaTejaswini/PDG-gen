import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		int n = ipt.nextInt(), m = ipt.nextInt(), sum = 0;
		int[][] lst = new int[n][2];
		///収納
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++)
				lst[i][j] = ipt.nextInt();
		}
		//並び替え
		for (int i = 0; i < n; i++)
			for (int j = i; j < n; j++)
				if (lst[i][0] < lst[j][0]) {
					int tmp1 = lst[i][0], tmp2 = lst[i][1];
					lst[i][0] = lst[j][0];
					lst[i][1] = lst[j][1];
					lst[j][0] = tmp1;
					lst[j][1] = tmp2;
				}
		int day = 0;
		for (int i = 0; i < n; i++) {
			if (m - lst[i][0] < 0 || lst[i][0] - i < 0)
				continue;
			else {
				day = lst[i][0];
				sum += lst[i][1];
			}
		}

		System.out.println(sum);
		ipt.close();
	}
}