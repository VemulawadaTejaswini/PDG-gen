import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値(N)
		int numN = scan.nextInt();
		int numP[] = new int[numN];

		for (int i = 0; i < numN; i++) {
			numP[i] = scan.nextInt();
		}


		int sum = 0;
		for (int i = 0; i < numN - 1; i++) {
			int max = numP[i];
			int next = 0;
			for (int j = i+1; j < numN; j++) {
				if (numP[j] > max) {
					next = max;
					max = numP[j];
				} else if (numP[j] > next) {
					next = numP[j];
				}
				sum += next;
			}
		}
		System.out.println(sum);
	}
}