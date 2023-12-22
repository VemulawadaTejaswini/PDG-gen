import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int[] num = new int[3];
		num[0] = sc1.nextInt();
		num[1] = sc1.nextInt();
		num[2] = sc1.nextInt();
		int ans = 0;

		num = sort(num);

		while (num[0] != num[1] || num[1] != num[2] ) {

			if (num[2] >= num[0] + 2) {
				num[0] += 2;
			}
			else {
				num [0] += 1;
				num [1] += 1;
			}
			ans++;
			num = sort(num);
			//System.out.println(num[0] + " " + num[1] + " " + num[2]);
		}

		System.out.println(ans);

		sc1.close();
	}

	static int[] sort(int[] num) {

		for (int i =0 ; i < 2 ; i++ ) {
			for (int index = 0; index < 2 ; index ++) {
				if (num[index] > num[index + 1]) {
					int a = num[index];
					int b = num[index+1];
					num[index] = b;
					num[index+1] = a;
				}
			}
		}

		return num;
	}

}