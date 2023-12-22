import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		for (int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		
		int index = 0;
		double ans = Math.abs((T-H[0]*0.006)-A);
		for (int i=0; i<N; i++) {
			if (Math.abs(T-H[i]*0.006-A)<ans) {
				index = i+1;
			}
		}
		
		System.out.println(index);
	}

}
