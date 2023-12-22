import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Input
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		//logic
		double cx = W/2;
		double cy = H/2;

		int count = 0;

		if(cx - x == 0 && cy - y == 0) {
			count = 1;
		}

		double answer = (W * H) / 2;

		System.out.println(answer + " " + count);

	}

}
