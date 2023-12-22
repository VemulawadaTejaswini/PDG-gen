import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		final int M = Integer.parseInt(sc.next());
		final int D = Integer.parseInt(sc.next());
		int d10 = D / 10;
		int sum  = 0;
		if(d10 > 1 && M >= 4) {
			for(int i = 2; i < d10; i++) {
				for(int j = i + 1; j <= M; j++) {
					if(j % i == 0 && j / i != 1 ) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
