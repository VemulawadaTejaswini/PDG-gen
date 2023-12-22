import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long K = sc.nextLong();
		long max = 0;
		long fMax = 0;
		Long[] array = new Long[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextLong();
		}

		for (int i = 0; i <= K; i++) {
			for (int j = 0; j < array.length; j++) {
				fMax += (i ^ array[j]);
			}
			if(max < fMax) {
				max = fMax;
			}
			fMax = 0;

		}
		System.out.println(max);
	}

}
