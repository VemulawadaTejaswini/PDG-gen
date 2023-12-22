import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int array[][] = new int[m][4];//pr, year, index, old
		for(int i = 0; i < m; i ++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
			array[i][2] = i;
		}

		Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));

		int index = 0;
		for(int i = 1; i <= m; i ++) {
			if(i == m) {
				checkYear(array, index, i);
			}else if(array[i - 1][0] != array[i][0]) {
				checkYear(array, index, i);
				index = i;
			}
		}


		Arrays.sort(array, (a, b) -> Integer.compare(a[2], b[2]));
		for(int i = 0; i < m; i ++) {
			System.out.printf("%012d\n", array[i][0] * 1000000 + array[i][3]);
		}
	}

	private static void checkYear(int array[][], int index, int i) {
		for(int j = index; j < i; j ++) {
			int min = 1000000001;
			int minIndex = 0;
			for(int k = index; k < i; k ++) {
				if(array[k][3] != 0) { continue; }
				if(array[k][1] < min) {
					min = array[k][1];
					minIndex = k;
				}
			}
			array[minIndex][3] = j - index + 1;
		}
	}
}