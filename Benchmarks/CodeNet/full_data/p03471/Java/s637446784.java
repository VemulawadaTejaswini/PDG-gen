import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n,y;

		n = sc.nextInt();
		y = sc.nextInt();

		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				for(int k = 0 ; k <= n; k++) {
					int total = 10000*i+5000*j+1000*k;

					if(total == y) {
						System.out.println(i+" "+j+" "+k);
						return;
					}
				}
			}
		}
		System.out.println("-1 -1 -1");

	}

}
