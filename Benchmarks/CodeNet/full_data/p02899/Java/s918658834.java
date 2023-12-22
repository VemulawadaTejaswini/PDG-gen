
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] enter = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			int num = sc.nextInt();
			enter[num] = i;
		}
		for(int i = 1; i < n + 1; i++) {
			System.out.print(enter[i] + " ");
		}
		System.out.println();
	}

}
