import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] array = new int[a];
		int count = 0;
		for(int i = 0; i < a; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 1; i < array.length - 1; i++) {
			if(array[i -1] < array[i] && array[i] < array[i + 1]) {
				count++;
			}else if(array[i + 1] < array[i] && array[i] < array[i - 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}