import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int[] rgbs = new int[N];
		int sum = 0;

		for(int i =  0; i < N; i++) {
			char c = S.charAt(i);
			if(c == 'R') {
				rgbs[i] = 1;	//R
				continue;
			}
			if(c == 'G') {
				rgbs[i] = 2;	//G
				continue;
			}
			if(c == 'B') {
				rgbs[i] = 4;	//B
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(rgbs[i] == rgbs[j]) {
					continue;
				}
				int x = rgbs[i] + rgbs[j];
				int y = 7 - x;
				for(int k = j+1; k < N; k++) {
					//条件2
					if(j - i == k - j) {
						continue;
					}
					if(rgbs[k] == y) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
