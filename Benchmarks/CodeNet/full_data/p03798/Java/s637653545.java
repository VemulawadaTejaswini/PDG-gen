import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		char[][] mixed = new char[4][n];
		mixed[0][0] = 'W';
		mixed[0][1] = 'W';
		mixed[1][0] = 'W';
		mixed[1][1] = 'S';
		mixed[2][0] = 'S';
		mixed[2][1] = 'W';
		mixed[3][0] = 'S';
		mixed[3][1] = 'S';
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < n; j++) {
				if (mixed[i][j - 2] == 'S' ^ mixed[i][j - 1] == 'S' ^ arr[j - 1] == 'o') {
					mixed[i][j] = 'S';
				} else {
					mixed[i][j] = 'W';
				}
			}
			if ((mixed[i][n - 1] == 'S' ^ mixed[i][0] == 'S' ^ arr[0] == 'o' ^ mixed[i][1] == 'W') && 
				(mixed[i][n - 2] == 'S' ^ mixed[i][n - 1] == 'S' ^ arr[n - 1] == 'o' ^ mixed[i][0] == 'W')) {
				System.out.println(mixed[i]);
				return;
			}
		}
		System.out.println(-1);
	}
}
