import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		long[] cols = new long[a];

		int cnt = 0;
		int max = 0;

		for (int i = 0; i < a; i++) {
			cols[i] = sc.nextInt();
			if (i != 0 && cols[i] <= cols[i - 1]) {
				cnt++;
			} else {
				if (max < cnt) {
					max = cnt;
				}
				cnt = 0;
			}
		}
		if (max < cnt) {
			max = cnt;
		}


		System.out.println(max);
	}

}

