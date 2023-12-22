import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int min = 101;
		int max = -101;
		int sum = 1000000000;
		int tmp = 0;
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(min > a[i]) {
				min = a[i];
			}
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		for(int i = min; i <= max; i++) {
			for(int j = 0; j < N; j++) {
				tmp += (int)Math.pow(a[j] - i, 2);
			}
			if(tmp < sum) {
				sum = tmp;
			}
			tmp = 0;
		}
		
		System.out.println(sum);
		
		scan.close();
	}

}
