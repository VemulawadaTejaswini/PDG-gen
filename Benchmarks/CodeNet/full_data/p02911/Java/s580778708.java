import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] mem = new int[N];
		for(int i = 0; i < N; i++) {
			mem[i] = K;
		}
		while(sc.hasNext()) {
			int val = sc.nextInt();
			for(int i = 0; i < N; i++) {
				if(val -1 != i) {
					mem[i] -= 1;
				}
			}
		}
		for(int i = 0; i < N;i++) {
			if(mem[i] > 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		//Q-Kの値よりAiに出てくる回数が小さいものを敗退でも良いかも
	}

}