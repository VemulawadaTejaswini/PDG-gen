import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int [] list = new int [5];

		//グループ人数
		long n = Long.parseLong(sc.next());
		//最小人数
		long min = (long) Math.pow(10, 15);
//		System.out.println("N: " + n);



		for (int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(sc.next());
			int v = list[i];
			if(v < min) {
				min = v;
			}
//			System.out.println("MIN: " + min);

		}

		if(n <= min) {
			System.out.println(5);
		}else {
			long ans = (int)Math.ceil(n / min) + 5 ;
			System.out.println(ans);
		}






	}

}
