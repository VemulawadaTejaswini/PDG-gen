import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int X[] = new int[5];
		int d = 0;
		
		for (int i = 0; i < 5; i++) {
			int x = scanner.nextInt();
			X[i] = x;
		}
		int k = scanner.nextInt();
		
		for (int j = 0; j < 4; j++) {
			d = X[j + 1] - X[j];
			//System.out.println(d);
			if (d > k) {
				count += 1;
			}
		}
		
		if (count != 0) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}