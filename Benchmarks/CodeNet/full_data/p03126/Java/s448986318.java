package test;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Scanner nLine = new Scanner(reader.nextLine());
		int n = nLine.nextInt();
		int m = nLine.nextInt();
		int[] unique = new int[31];
		int count = 0;


		while (reader.hasNextLine()) {
			Scanner line = new Scanner(reader.nextLine());
			int base = line.nextInt();
			while (base > 0) {
				int i = line.nextInt();
				unique[i]++;
				base--;
			}

		}

		for(int j = 0; j < m; j++) {
			if (unique[j] == n) {
				count++;
			}
		}

		System.out.print(count);

	}


}
