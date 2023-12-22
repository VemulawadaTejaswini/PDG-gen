import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] weightList = new int[N];
		for (int i = 0 ; i < N; i++) {
			weightList[i] = sc.nextInt();
		}
		int nokori = X;
		for (int weight : weightList) {
			nokori = nokori - weight;
		}
		Arrays.sort(weightList);

		int dounuts = N + (nokori / weightList[0]);
		System.out.println(dounuts);


	}
}
