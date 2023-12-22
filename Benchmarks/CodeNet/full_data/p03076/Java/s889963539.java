
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] food = new int [5];

		for (int i = 0; i < 5; i++) {
			food[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		// 自分より一番近くて大きい10の倍数にしてすべて足す
		for (int i = 0; i < 5; i++) {
			sum += (food[i] + 9) / 10 * 10; 
		}
		
		// 1の位が1より大きく一番近い料理の分引く
		
		int min = 10;
		
		for (int i = 0; i < 5; i++) {
			if (food[i]%10 == 0) {
				continue;
			}
			
			min = Math.min(min, food[i] % 10);
		}
		
		System.out.println(sum - (10 - min));
		
	}
	
	


}



