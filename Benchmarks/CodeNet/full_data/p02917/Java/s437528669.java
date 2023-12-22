import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N - 1];
		for(int i = 0; i < N - 1; i++) {
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(i == 0) {
				sum += num[i];
			}else if(i == N - 1) {
				sum += num[i - 1];
			}else {
				sum += Math.min(num[i], num[i - 1]);
			}
		}
		System.out.println(sum);

	}


}
