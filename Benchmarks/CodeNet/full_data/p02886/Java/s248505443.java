import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] delicious = new int[n];
		int sum = 0;

		for(int i=0; i<n; i++){
			delicious[i] = scanner.nextInt();
		}

		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				sum += delicious[i] * delicious[j];
			}
		}

		System.out.print(sum);
	}
}
