import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int [] mountain = new int [a];

		for (int i = 0; i < a; i++) {
			mountain[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 1; i < mountain.length; i++) {
			for (int j = 0; j < i; j++) {
				if (mountain[i] < mountain[j]) {
					count++;
					break;
				}
			}

		}

		System.out.println(a - count);
	}
}