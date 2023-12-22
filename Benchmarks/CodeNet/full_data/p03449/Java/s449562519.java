import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//入力受付
		Scanner scanner = new Scanner(System.in);

		int N = Integer.parseInt(scanner.nextLine());
		int[][] intList = new int[2][N];
		int result[] = {0,0};
		int times = 0;
		String[] tempList = scanner.nextLine().split(" ");
		String[] tempList2 = scanner.nextLine().split(" ");
		for(int i = 0; i < N; i++) {
		    intList[0][i] = Integer.parseInt(tempList[i]);
		}
		for(int i = 0; i < N; i++) {
			intList[1][i] = Integer.parseInt(tempList2[i]);
		}

		//Max
		for(int i = 0; i < N; i++) {
			for(int j = N - 1; j >= 0; j--) {
				result[1] +=intList[0][j];
				times++;
			}
			if(N - 1 == times) {
				result[1] += intList[1][N];
			}else{
				for(int k = times - 1; k < N; k++) {
					result[1] +=intList[1][k];
				}

			}
			result[0] = Math.max(result[0], result[1]);
			result[1] = 0;
		}

		System.out.println(result[0]);
	}
}
