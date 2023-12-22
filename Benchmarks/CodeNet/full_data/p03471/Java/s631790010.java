import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n,y;

		n = sc.nextInt();
		y = sc.nextInt();

		int i,j,k;



		for(i = 0; i <= n; i++) {
			for(j = 0; j <= n; j++) {
				for(k = 0 ; k <= n; k++) {

					int total = 10000*i+5000*j+1000*k;
					if(i+j+k > n || total > y) {
						break;
					}

					if(total == y && i+j+k == n) {
						System.out.println(i+" "+j+" "+k);
						return;
					}
				}
			}
		}
		System.out.println("-1 -1 -1");

	}

}
