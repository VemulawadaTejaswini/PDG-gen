import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int data[][] = new int[m][2];

		for (int i = 0; i < m; i++) {
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
		}

		int min = data[0][0];
		int max = data[0][1];

		for (int i = 1; i < m; i++) {
			if (min < data[i][0]) {
				min = data[i][0];
			}
			if (max > data[i][1]) {
				max = data[i][1];
			}
		}

		int result = max - min + 1;
		
		if (result < 0) {
			System.out.println(0);
		} else {
			System.out.println(result);
		}
	}
}