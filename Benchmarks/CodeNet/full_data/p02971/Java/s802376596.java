import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int road = sc.nextInt();
		int[] floor = new int[road];
		int[] second = new int[road];
		for(int i = 0; i<road; i++) {
			floor[i] = sc.nextInt();
			second[i] = floor[i];
		}
		Arrays.sort(floor);
		//max値を取り出す。
		for(int i = 0; i<floor.length; i++) {
			if(second[i] == floor[road-1]) {
					System.out.println(floor[road-2]);
			}else {
				System.out.println(floor[road-1]);
			}
		}
	}
}