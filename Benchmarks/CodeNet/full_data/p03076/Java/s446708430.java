
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dish;
		int time = 0;
		for(int i = 0; i < 5; i++) {
			dish = sc.nextInt();
			if(dish % 10 == 0) {
				time += dish;
			} else {
				time += dish + 10 - dish % 10;
			}
		}
		System.out.println(time);
	}

}
