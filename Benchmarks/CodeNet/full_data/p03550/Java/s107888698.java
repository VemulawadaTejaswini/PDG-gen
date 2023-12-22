import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int Z = reader.nextInt();
		int originalW = reader.nextInt();
		int W = originalW;
		int[] arr = new int[N];
		for (int i = 0; i <N; i++) {
			arr[i] = reader.nextInt();
		}
		int current = 0;
		boolean isZturn = true;
		while (current < N) {
			if (isZturn) {
				for (int i = current; i <N; i++) {
					if (arr[i] > arr[current]) {
						current = i;
					}
				}
				Z = arr[current];
			} else {
				for (int i = current; i <N; i++) {
					if (arr[i] < arr[current]) {
						current = i;
					}
				}
				W = arr[current];
			}
			isZturn = !isZturn;
			current++;
		}

		int ans = Math.max(Math.abs(Z - W), Math.abs(arr[N-1]-originalW));



		System.out.print(ans);
		reader.close();
	}
}



