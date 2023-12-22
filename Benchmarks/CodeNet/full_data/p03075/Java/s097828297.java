
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] distance = new int[5];
		for(int i = 0; i < 5; i++) {
			distance[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int count = 0;
		boolean flag = true;

		for(int i = distance.length - 1; i >= 0; i--) {
			for(int j = i-1; j >= 0; j--) {
//				System.out.println(k);
//				System.out.println(distance[i]);
//				System.out.println(distance[j]);
//				System.out.println();
				if(k < distance[i] - distance[j]) {
					flag = false;
					break;
				}
			}
			if(!flag) {
				break;
			}

		}
		if(flag) {
			System.out.println("Yay!");
		}
		else {
			System.out.println(":(");
		}

	}

}
