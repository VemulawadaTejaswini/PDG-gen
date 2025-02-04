import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int students [] [] = new int [n] [2];
		int points [] [] = new int [m] [2];
		for (int i = 0 ; i < n ; i++) {
			students [i] [0] = scanner.nextInt();
			students [i] [1] = scanner.nextInt();
		}
		for (int j = 0 ; j < m ; j++) {
			points [j] [0] = scanner.nextInt();
			points [j] [1] = scanner.nextInt();
		}
		
		int [] result = new int [n];
		for (int i = 0 ; i < n ; i++) {
			int minDist = 10000;
			int minIndex = 0;
			for (int j = 0 ; j < m ; j++) {
				int dist = Math.abs(students [i] [0] - points [j] [0]) + Math.abs(students [i] [1] - points [j] [1]);
				if (dist < minDist) {
					minDist = dist;
					minIndex = j;
				}
			}
			result [i]= minIndex + 1;
			System.out.println(result [i]);
		}
	}
} 