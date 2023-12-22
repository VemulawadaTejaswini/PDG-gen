import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int TowerArray[] = new int[1000];
		TowerArray[0] = 0;

		for(int i = 1; i < 1000; i++ ) {
			TowerArray[i] = TowerArray[i-1] + i;
		}

		int n = b - a;

		System.out.println(TowerArray[n] - b);

	}

}