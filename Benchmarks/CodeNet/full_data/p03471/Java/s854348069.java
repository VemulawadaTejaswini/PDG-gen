import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		int total = 0;
		int x = -1;
		int y = -1;
		int z = -1;

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i+N; j++) {
				//差分を求めてループを減らす
				int k = N - (i + j);
				total = i*10000 + j*5000 + k*1000;
				if(total == Y) {
					x = i;
					y = j;
					z = k;
				}
			}
		}
		System.out.println(x + " " + y + " " + z);
	}

}