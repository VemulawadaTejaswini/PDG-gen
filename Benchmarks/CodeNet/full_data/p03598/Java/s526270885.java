import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int xN[] = new int[N];
		for(int i = 0;i < N;i++) {
			xN[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0;i < N;i++) {
			sum += Math.min(Math.abs(K-xN[i])*2,xN[i]*2);
		}
		System.out.print(sum);


	}

}