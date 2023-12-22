import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Aの価格
		int A = sc.nextInt();
		//Bの価格
		int B = sc.nextInt();
		//ABの価格
		int C = sc.nextInt();
		//必要なAの枚数
		int X = sc.nextInt();
		//必要なBの枚数
		int Y = sc.nextInt();

		int max = Math.max(X, Y);

		int result = C * 2 * max;

		//Aの枚数
		int x = max;
		//Bの枚数
		int y = max;

		for(int i=0; i<max; i++) {
			//ABを一枚減らしてAかBの片方もしくは両方を一枚増やしたときの合計価格
			int temp = result;
			temp -= 2 * C;
			if(--x<X) {
				x++;
				temp += A;
			}
			if(--y<Y) {
				y++;
				temp += B;
			}

			if(temp >= result) {
				break;
			} else {
				result = temp;
			}
		}

		System.out.println(result);

	}



}
