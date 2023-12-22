import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numbers = new int[N];
		
		for(int j = 0; j  <numbers.length; j++) {
			numbers[j] = sc.nextInt();
		}
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i = 1; i < numbers.length; i++ ) {
			if(numbers[i] > max ) {
				max = numbers[i];
			}
			if(numbers[i] < min ) {
				min = numbers[i];
			}
		}
		System.out.println(max-min);
	}

}
