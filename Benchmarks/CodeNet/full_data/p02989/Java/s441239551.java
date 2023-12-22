
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];

		for(int i = 0; i < N; i++) {
			String line = sc.next();
			d[i] = Integer.parseInt(line);
		}

		int K = 0;
		int count = 0;
		int countLeft = 0;
		int countRight = N;
		Arrays.sort(d);

		for(int i = 0; i < N; i++) {
			countLeft++;
			countRight--;
			if(countLeft == countRight) {
				K = d[i];
				while(d[i] <= K && K < d[i+1]) {
					K++;
					count++;
				}
				break;
			}
		}
		System.out.println(count);
	}

}
