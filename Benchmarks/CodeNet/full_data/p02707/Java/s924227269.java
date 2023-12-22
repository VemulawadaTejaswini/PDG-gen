import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int emp;

		Scanner scan = new Scanner(System.in);

		emp = scan.nextInt();
		int[] array = new int[emp-1];
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		int[] manager = new int[emp+1];
		for(int i = 0; i < array.length; i++) {
			manager[array[i]]++;
		}

		for(int i = 1; i < manager.length; i++) {
			System.out.println(manager[i]);
		}
	}
}
