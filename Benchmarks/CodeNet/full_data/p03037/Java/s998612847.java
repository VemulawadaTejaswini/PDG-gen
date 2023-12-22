import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		//IDカード枚数
		int N = scanner.nextInt();
		//ゲートの個数
		int M = scanner.nextInt();
		List<Integer> listL = new ArrayList<Integer>();
		List<Integer> listR = new ArrayList<Integer>();
		//L,RのIDカード
		for(int i = 0; i < M; i++){
			
			int L = scanner.nextInt();
			int R = scanner.nextInt();
			
			//1番目のゲートを通過できるカードから順にM番目のゲートを通過できるカードを絞り込む？
		}
		
	}

}