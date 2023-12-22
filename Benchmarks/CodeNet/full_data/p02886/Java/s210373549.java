
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] takoyakis = new int[n];
		for(int i = 0; i < n; i++){
			takoyakis[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < n; i++){
			for(int k = i + 1; k < n; k++){
				sum += takoyakis[i] * takoyakis[k];
			}
		}
		System.out.println(sum);
	}
}
