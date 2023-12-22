
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] dish = new int[5];
		int min = 10;

		for(int i = 0; i < 5; i++) {
			dish[i] = sc.nextInt();
			int temp = dish[i] % 10;//1の位を取ってくる

			if(0 < temp && temp < min) {//0より大きく、minより小さければ
				min = temp;
			}
		}

		int totalTime = 0;
		for(int i = 0; i < dish.length; i++) {
			if(dish[i] % 10 != 0) {//1の位が0以外のものはすべて切り上げを行う //このままだと、最後に運ばれるdishの時間が余計に加算される
				totalTime += (dish[i]/10 + 1) * 10;
			}else {//1の位が0の場合はそのまま足し算
				totalTime += dish[i];
			}
		}

		min = 10 - min;//1の位が最も小さい値から10を引けば、加算分を引くことが出来る
		System.out.println(totalTime-min);
	}

}
