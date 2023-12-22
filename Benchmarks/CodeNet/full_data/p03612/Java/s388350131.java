import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt()-1;
		}
		int count = 0;
		for(int i = 0; i < n-1; i++) {
			if(i == arr[i]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		System.out.println(count);
	}
}