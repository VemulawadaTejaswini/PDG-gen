import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] monster = new int[n];
		for(int i = 0; i < n; i ++) {
			monster[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(monster);
		int min = monster[0];
		for(int i = 0; i < n-1; i ++) {
			for(int j = i + 1; j < n; j ++) {
				if(monster[j] % monster[i] < min && monster[j] % monster[i] != 0) {
					min = monster[j] % monster[i];
				}
			}
		}

		System.out.println(min);
	}
}