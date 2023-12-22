import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int n = Integer.parseInt(scanner.nextLine());

		String[] temp = scanner.nextLine().split(" ");
		int[] list    = new int[n];

		for(int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(temp[i]);
		}

		int count = 0;

		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					if(list[i] + list[j] > list[k] && list[k] + list[j] > list[i] && list[i] + list[k] > list[j]) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}
}
