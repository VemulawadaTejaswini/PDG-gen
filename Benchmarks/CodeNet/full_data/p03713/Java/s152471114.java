
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int hw = H * W;
		long ans = 0;
		long ans2 = 0;
		long tmp = 0;
		long tmp2 = 0;
		long tmp3 = 0;

		if(H%3 == 0){
			System.out.println("0");
			System.exit(0);
		}

		if(W%3 == 0){
			System.out.println("0");
			System.exit(0);
		}

	//	if (H > W) {
			tmp = (H / 3);

			tmp = tmp;
			tmp = tmp * W;

	//		System.out.println(tmp);

			tmp2 = H/3;
			tmp2 = H - tmp2;
	//		System.out.println(tmp2);
			tmp2 = tmp2 * W /2;

			ans = tmp - tmp2;

			if (ans < 0) {
				ans = tmp2 - tmp;
			}

			tmp2 = W/2;
			tmp2 = tmp2 * H - H/3;

	//		System.out.println(tmp2);

			ans2 = tmp - tmp2;

			if (ans2 < 0) {
				ans2 = tmp2 - tmp;
			}

			System.out.println(Math.min(ans, ans2));


	//	}





	}

}
